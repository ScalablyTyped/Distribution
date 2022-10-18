package typings.redisTimeSeries

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMod.MRangeRawReply
import typings.redisTimeSeries.distCommandsMod.MRangeWithLabelsOptions
import typings.redisTimeSeries.distCommandsMod.MRangeWithLabelsReplyItem
import typings.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsMrangeWITHLABELSMod {
  
  @JSImport("@redis/time-series/dist/commands/MRANGE_WITHLABELS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/MRANGE_WITHLABELS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(fromTimestamp: Timestamp, toTimestamp: Timestamp, filters: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    fromTimestamp: Timestamp,
    toTimestamp: Timestamp,
    filters: String,
    options: MRangeWithLabelsOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(fromTimestamp: Timestamp, toTimestamp: Timestamp, filters: js.Array[String]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    fromTimestamp: Timestamp,
    toTimestamp: Timestamp,
    filters: js.Array[String],
    options: MRangeWithLabelsOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: MRangeRawReply): js.Array[MRangeWithLabelsReplyItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[MRangeWithLabelsReplyItem]]
}
