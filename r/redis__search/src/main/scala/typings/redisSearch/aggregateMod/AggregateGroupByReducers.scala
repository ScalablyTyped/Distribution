package typings.redisSearch.aggregateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregateGroupByReducers extends StObject
@JSImport("@redis/search/dist/commands/AGGREGATE", "AggregateGroupByReducers")
@js.native
object AggregateGroupByReducers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AggregateGroupByReducers & String] = js.native
  
  @js.native
  sealed trait AVG
    extends StObject
       with AggregateGroupByReducers
  /* "AVG" */ val AVG: typings.redisSearch.aggregateMod.AggregateGroupByReducers.AVG & String = js.native
  
  @js.native
  sealed trait COUNT
    extends StObject
       with AggregateGroupByReducers
  /* "COUNT" */ val COUNT: typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT & String = js.native
  
  @js.native
  sealed trait COUNT_DISTINCT
    extends StObject
       with AggregateGroupByReducers
  /* "COUNT_DISTINCT" */ val COUNT_DISTINCT: typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCT & String = js.native
  
  @js.native
  sealed trait COUNT_DISTINCTISH
    extends StObject
       with AggregateGroupByReducers
  /* "COUNT_DISTINCTISH" */ val COUNT_DISTINCTISH: typings.redisSearch.aggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH & String = js.native
  
  @js.native
  sealed trait FIRST_VALUE
    extends StObject
       with AggregateGroupByReducers
  /* "FIRST_VALUE" */ val FIRST_VALUE: typings.redisSearch.aggregateMod.AggregateGroupByReducers.FIRST_VALUE & String = js.native
  
  @js.native
  sealed trait MAX
    extends StObject
       with AggregateGroupByReducers
  /* "MAX" */ val MAX: typings.redisSearch.aggregateMod.AggregateGroupByReducers.MAX & String = js.native
  
  @js.native
  sealed trait MIN
    extends StObject
       with AggregateGroupByReducers
  /* "MIN" */ val MIN: typings.redisSearch.aggregateMod.AggregateGroupByReducers.MIN & String = js.native
  
  @js.native
  sealed trait QUANTILE
    extends StObject
       with AggregateGroupByReducers
  /* "QUANTILE" */ val QUANTILE: typings.redisSearch.aggregateMod.AggregateGroupByReducers.QUANTILE & String = js.native
  
  @js.native
  sealed trait RANDOM_SAMPLE
    extends StObject
       with AggregateGroupByReducers
  /* "RANDOM_SAMPLE" */ val RANDOM_SAMPLE: typings.redisSearch.aggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE & String = js.native
  
  @js.native
  sealed trait STDDEV
    extends StObject
       with AggregateGroupByReducers
  /* "STDDEV" */ val STDDEV: typings.redisSearch.aggregateMod.AggregateGroupByReducers.STDDEV & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with AggregateGroupByReducers
  /* "SUM" */ val SUM: typings.redisSearch.aggregateMod.AggregateGroupByReducers.SUM & String = js.native
  
  @js.native
  sealed trait TOLIST
    extends StObject
       with AggregateGroupByReducers
  /* "TOLIST" */ val TOLIST: typings.redisSearch.aggregateMod.AggregateGroupByReducers.TOLIST & String = js.native
  
  @js.native
  sealed trait TO_LIST
    extends StObject
       with AggregateGroupByReducers
  /* "TOLIST" */ val TO_LIST: typings.redisSearch.aggregateMod.AggregateGroupByReducers.TO_LIST & String = js.native
}
