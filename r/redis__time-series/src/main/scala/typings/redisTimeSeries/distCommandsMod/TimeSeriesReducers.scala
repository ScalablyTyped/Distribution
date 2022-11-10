package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeSeriesReducers extends StObject
@JSImport("@redis/time-series/dist/commands", "TimeSeriesReducers")
@js.native
object TimeSeriesReducers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimeSeriesReducers & String] = js.native
  
  @js.native
  sealed trait AVG
    extends StObject
       with TimeSeriesReducers
  /* "AVG" */ val AVG: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.AVG & String = js.native
  
  @js.native
  sealed trait COUNT
    extends StObject
       with TimeSeriesReducers
  /* "COUNT" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.COUNT & String = js.native
  
  @js.native
  sealed trait MAX
    extends StObject
       with TimeSeriesReducers
  /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MAX & String = js.native
  
  @js.native
  sealed trait MAXIMUM
    extends StObject
       with TimeSeriesReducers
  /* "MAX" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MAXIMUM & String = js.native
  
  @js.native
  sealed trait MIN
    extends StObject
       with TimeSeriesReducers
  /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MIN & String = js.native
  
  @js.native
  sealed trait MINIMUM
    extends StObject
       with TimeSeriesReducers
  /* "MIN" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MINIMUM & String = js.native
  
  @js.native
  sealed trait RANGE
    extends StObject
       with TimeSeriesReducers
  /* "range" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.RANGE & String = js.native
  
  @js.native
  sealed trait STD_P
    extends StObject
       with TimeSeriesReducers
  /* "STD.P" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.STD_P & String = js.native
  
  @js.native
  sealed trait STD_S
    extends StObject
       with TimeSeriesReducers
  /* "STD.S" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.STD_S & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with TimeSeriesReducers
  /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.SUM & String = js.native
  
  @js.native
  sealed trait VAR_P
    extends StObject
       with TimeSeriesReducers
  /* "VAR.P" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.VAR_P & String = js.native
  
  @js.native
  sealed trait VAR_S
    extends StObject
       with TimeSeriesReducers
  /* "VAR.S" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.VAR_S & String = js.native
}
