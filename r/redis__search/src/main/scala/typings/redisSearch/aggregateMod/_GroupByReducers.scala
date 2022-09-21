package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateGroupByReducers.AVG
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCT
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.FIRST_VALUE
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.MAX
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.MIN
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.QUANTILE
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.STDDEV
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.SUM
import typings.redisSearch.aggregateMod.AggregateGroupByReducers.TOLIST
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GroupByReducers extends StObject
object _GroupByReducers {
  
  inline def AvgReducer(property: PropertyName, `type`: AVG): typings.redisSearch.aggregateMod.AvgReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.AvgReducer]
  }
  
  inline def CountDistinctReducer(property: PropertyName, `type`: COUNT_DISTINCT): typings.redisSearch.aggregateMod.CountDistinctReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.CountDistinctReducer]
  }
  
  inline def CountDistinctishReducer(property: PropertyName, `type`: COUNT_DISTINCTISH): typings.redisSearch.aggregateMod.CountDistinctishReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.CountDistinctishReducer]
  }
  
  inline def FirstValueReducer(property: PropertyName, `type`: FIRST_VALUE): typings.redisSearch.aggregateMod.FirstValueReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.FirstValueReducer]
  }
  
  inline def MaxReducer(property: PropertyName, `type`: MAX): typings.redisSearch.aggregateMod.MaxReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.MaxReducer]
  }
  
  inline def MinReducer(property: PropertyName, `type`: MIN): typings.redisSearch.aggregateMod.MinReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.MinReducer]
  }
  
  inline def QuantileReducer(property: PropertyName, quantile: Double, `type`: QUANTILE): typings.redisSearch.aggregateMod.QuantileReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], quantile = quantile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.QuantileReducer]
  }
  
  inline def RandomSampleReducer(property: PropertyName, sampleSize: Double, `type`: RANDOM_SAMPLE): typings.redisSearch.aggregateMod.RandomSampleReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], sampleSize = sampleSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.RandomSampleReducer]
  }
  
  inline def StdDevReducer(property: PropertyName, `type`: STDDEV): typings.redisSearch.aggregateMod.StdDevReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.StdDevReducer]
  }
  
  inline def SumReducer(property: PropertyName, `type`: SUM): typings.redisSearch.aggregateMod.SumReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.SumReducer]
  }
  
  inline def ToListReducer(property: PropertyName, `type`: TOLIST): typings.redisSearch.aggregateMod.ToListReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.redisSearch.aggregateMod.ToListReducer]
  }
}
