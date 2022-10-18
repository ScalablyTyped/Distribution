package typings.redisTimeSeries.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMod.Filter
import typings.redisTimeSeries.distCommandsMod.MRangeRawReply
import typings.redisTimeSeries.distCommandsMod.MRangeWithLabelsOptions
import typings.redisTimeSeries.distCommandsMod.MRangeWithLabelsReplyItem
import typings.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMREVRANGEWITHLABEL extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(fromTimestamp: Timestamp, toTimestamp: Timestamp, filters: Filter): RedisCommandArguments = js.native
  def transformArguments(
    fromTimestamp: Timestamp,
    toTimestamp: Timestamp,
    filters: Filter,
    options: MRangeWithLabelsOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: MRangeRawReply): js.Array[MRangeWithLabelsReplyItem] = js.native
}
