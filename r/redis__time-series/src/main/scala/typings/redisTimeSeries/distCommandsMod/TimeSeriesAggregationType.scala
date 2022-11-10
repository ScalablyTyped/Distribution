package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeSeriesAggregationType extends StObject
@JSImport("@redis/time-series/dist/commands", "TimeSeriesAggregationType")
@js.native
object TimeSeriesAggregationType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimeSeriesAggregationType & String] = js.native
  
  @js.native
  sealed trait AVERAGE
    extends StObject
       with TimeSeriesAggregationType
  /* "AVG" */ val AVERAGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVERAGE & String = js.native
  
  @js.native
  sealed trait AVG
    extends StObject
       with TimeSeriesAggregationType
  /* "AVG" */ val AVG: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVG & String = js.native
  
  @js.native
  sealed trait COUNT
    extends StObject
       with TimeSeriesAggregationType
  /* "COUNT" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.COUNT & String = js.native
  
  @js.native
  sealed trait FIRST
    extends StObject
       with TimeSeriesAggregationType
  /* "FIRST" */ val FIRST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.FIRST & String = js.native
  
  @js.native
  sealed trait LAST
    extends StObject
       with TimeSeriesAggregationType
  /* "LAST" */ val LAST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.LAST & String = js.native
  
  @js.native
  sealed trait MAX
    extends StObject
       with TimeSeriesAggregationType
  /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAX & String = js.native
  
  @js.native
  sealed trait MAXIMUM
    extends StObject
       with TimeSeriesAggregationType
  /* "MAX" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAXIMUM & String = js.native
  
  @js.native
  sealed trait MIN
    extends StObject
       with TimeSeriesAggregationType
  /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MIN & String = js.native
  
  @js.native
  sealed trait MINIMUM
    extends StObject
       with TimeSeriesAggregationType
  /* "MIN" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MINIMUM & String = js.native
  
  @js.native
  sealed trait RANGE
    extends StObject
       with TimeSeriesAggregationType
  /* "RANGE" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.RANGE & String = js.native
  
  @js.native
  sealed trait STD_P
    extends StObject
       with TimeSeriesAggregationType
  /* "STD.P" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_P & String = js.native
  
  @js.native
  sealed trait STD_S
    extends StObject
       with TimeSeriesAggregationType
  /* "STD.S" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_S & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with TimeSeriesAggregationType
  /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.SUM & String = js.native
  
  @js.native
  sealed trait TWA
    extends StObject
       with TimeSeriesAggregationType
  /* "TWA" */ val TWA: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.TWA & String = js.native
  
  @js.native
  sealed trait VAR_P
    extends StObject
       with TimeSeriesAggregationType
  /* "VAR.P" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_P & String = js.native
  
  @js.native
  sealed trait VAR_S
    extends StObject
       with TimeSeriesAggregationType
  /* "VAR.S" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_S & String = js.native
}
