package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCREATERULE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(
    sourceKey: String,
    destinationKey: String,
    aggregationType: TimeSeriesAggregationType,
    bucketDuration: Double
  ): js.Array[String] = js.native
  def transformArguments(
    sourceKey: String,
    destinationKey: String,
    aggregationType: TimeSeriesAggregationType,
    bucketDuration: Double,
    alignTimestamp: Double
  ): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
