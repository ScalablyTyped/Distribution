package typings.redisTimeSeries.commandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeSeriesEncoding extends StObject
@JSImport("@redis/time-series/dist/commands", "TimeSeriesEncoding")
@js.native
object TimeSeriesEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimeSeriesEncoding & String] = js.native
  
  @js.native
  sealed trait COMPRESSED
    extends StObject
       with TimeSeriesEncoding
  /* "COMPRESSED" */ val COMPRESSED: typings.redisTimeSeries.commandsMod.TimeSeriesEncoding.COMPRESSED & String = js.native
  
  @js.native
  sealed trait UNCOMPRESSED
    extends StObject
       with TimeSeriesEncoding
  /* "UNCOMPRESSED" */ val UNCOMPRESSED: typings.redisTimeSeries.commandsMod.TimeSeriesEncoding.UNCOMPRESSED & String = js.native
}
