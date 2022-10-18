package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.AVG
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCT
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.QUANTILE
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM
import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST
import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GroupByReducers extends StObject
object _GroupByReducers {
  
  inline def AvgReducer(property: PropertyName, `type`: AVG): typings.redisSearch.distCommandsAggregateMod.AvgReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.AvgReducer]
  }
  
  inline def CountDistinctReducer(property: PropertyName, `type`: COUNT_DISTINCT): typings.redisSearch.distCommandsAggregateMod.CountDistinctReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.CountDistinctReducer]
  }
  
  inline def CountDistinctishReducer(property: PropertyName, `type`: COUNT_DISTINCTISH): typings.redisSearch.distCommandsAggregateMod.CountDistinctishReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.CountDistinctishReducer]
  }
  
  inline def FirstValueReducer(property: PropertyName, `type`: FIRST_VALUE): typings.redisSearch.distCommandsAggregateMod.FirstValueReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.FirstValueReducer]
  }
  
  inline def MaxReducer(property: PropertyName, `type`: MAX): typings.redisSearch.distCommandsAggregateMod.MaxReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.MaxReducer]
  }
  
  inline def MinReducer(property: PropertyName, `type`: MIN): typings.redisSearch.distCommandsAggregateMod.MinReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.MinReducer]
  }
  
  inline def QuantileReducer(property: PropertyName, quantile: Double, `type`: QUANTILE): typings.redisSearch.distCommandsAggregateMod.QuantileReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], quantile = quantile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.QuantileReducer]
  }
  
  inline def RandomSampleReducer(property: PropertyName, sampleSize: Double, `type`: RANDOM_SAMPLE): typings.redisSearch.distCommandsAggregateMod.RandomSampleReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], sampleSize = sampleSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.RandomSampleReducer]
  }
  
  inline def StdDevReducer(property: PropertyName, `type`: STDDEV): typings.redisSearch.distCommandsAggregateMod.StdDevReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.StdDevReducer]
  }
  
  inline def SumReducer(property: PropertyName, `type`: SUM): typings.redisSearch.distCommandsAggregateMod.SumReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.SumReducer]
  }
  
  inline def ToListReducer(property: PropertyName, `type`: TOLIST): typings.redisSearch.distCommandsAggregateMod.ToListReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.distCommandsAggregateMod.ToListReducer]
  }
}
