package typings.redisTimeSeries.commandsMod

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
  sealed trait MAXIMUM
    extends StObject
       with TimeSeriesReducers
  /* "max" */ val MAXIMUM: typings.redisTimeSeries.commandsMod.TimeSeriesReducers.MAXIMUM & String = js.native
  
  @js.native
  sealed trait MINIMUM
    extends StObject
       with TimeSeriesReducers
  /* "min" */ val MINIMUM: typings.redisTimeSeries.commandsMod.TimeSeriesReducers.MINIMUM & String = js.native
  
  @js.native
  sealed trait SUM
    extends StObject
       with TimeSeriesReducers
  /* "sum" */ val SUM: typings.redisTimeSeries.commandsMod.TimeSeriesReducers.SUM & String = js.native
}
