package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeSeriesBucketTimestamp extends StObject
@JSImport("@redis/time-series/dist/commands", "TimeSeriesBucketTimestamp")
@js.native
object TimeSeriesBucketTimestamp extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TimeSeriesBucketTimestamp & String] = js.native
  
  @js.native
  sealed trait HIGH
    extends StObject
       with TimeSeriesBucketTimestamp
  /* "+" */ val HIGH: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.HIGH & String = js.native
  
  @js.native
  sealed trait LOW
    extends StObject
       with TimeSeriesBucketTimestamp
  /* "-" */ val LOW: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.LOW & String = js.native
  
  @js.native
  sealed trait MID
    extends StObject
       with TimeSeriesBucketTimestamp
  /* "~" */ val MID: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.MID & String = js.native
}
