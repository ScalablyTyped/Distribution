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
  /* "avg" */ val AVERAGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVERAGE & String = js.native
  
  @js.native
  sealed trait COUNT
    extends StObject
       with TimeSeriesAggregationType
  /* "count" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.COUNT & String = js.native
  
  @js.native
  sealed trait FIRST
    extends StObject
       with TimeSeriesAggregationType
  /* "first" */ val FIRST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.FIRST & String = js.native
  
  @js.native
  sealed trait LAST
    extends StObject
       with TimeSeriesAggregationType
  /* "last" */ val LAST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.LAST & String = js.native
  
  @js.native
  sealed trait MAXIMUM
    extends StObject
       with TimeSeriesAggregationType
  /* "max" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAXIMUM & String = js.native
  
  @js.native
  sealed trait MINIMUM
    extends StObject
       with TimeSeriesAggregationType
  /* "min" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MINIMUM & String = js.native
  
  @js.native
  sealed trait RANGE
    extends StObject
       with TimeSeriesAggregationType
  /* "range" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.RANGE & String = js.native
  
  @js.native
  sealed trait STD_P
    extends StObject
       with TimeSeriesAggregationType
  /* "std.p" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_P & String = js.native
  
  @js.native
  sealed trait STD_S
    extends StObject
       with TimeSeriesAggregationType
  /* "std.s" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_S & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with TimeSeriesAggregationType
  /* "sum" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.SUM & String = js.native
  
  @js.native
  sealed trait VAR_P
    extends StObject
       with TimeSeriesAggregationType
  /* "var.p" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_P & String = js.native
  
  @js.native
  sealed trait VAR_S
    extends StObject
       with TimeSeriesAggregationType
  /* "var.s" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_S & String = js.native
}
