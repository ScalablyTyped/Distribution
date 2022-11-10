package typings.redisTimeSeries

import typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCreateruleMod {
  
  @JSImport("@redis/time-series/dist/commands/CREATERULE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/CREATERULE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    sourceKey: String,
    destinationKey: String,
    aggregationType: TimeSeriesAggregationType,
    bucketDuration: Double
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sourceKey.asInstanceOf[js.Any], destinationKey.asInstanceOf[js.Any], aggregationType.asInstanceOf[js.Any], bucketDuration.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(
    sourceKey: String,
    destinationKey: String,
    aggregationType: TimeSeriesAggregationType,
    bucketDuration: Double,
    alignTimestamp: Double
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sourceKey.asInstanceOf[js.Any], destinationKey.asInstanceOf[js.Any], aggregationType.asInstanceOf[js.Any], bucketDuration.asInstanceOf[js.Any], alignTimestamp.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
