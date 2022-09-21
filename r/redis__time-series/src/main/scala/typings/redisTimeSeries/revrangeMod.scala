package typings.redisTimeSeries

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.commandsMod.RangeOptions
import typings.redisTimeSeries.commandsMod.SampleRawReply
import typings.redisTimeSeries.commandsMod.SampleReply
import typings.redisTimeSeries.commandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revrangeMod {
  
  @JSImport("@redis/time-series/dist/commands/REVRANGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/REVRANGE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/time-series/dist/commands/REVRANGE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp, options: RangeOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[SampleRawReply]): js.Array[SampleReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[SampleReply]]
}
