package com.dao;

import com.entity.LvxingsheLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvxingsheLiuyanView;

/**
 * 旅行社留言 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface LvxingsheLiuyanDao extends BaseMapper<LvxingsheLiuyanEntity> {

   List<LvxingsheLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
