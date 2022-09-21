package typings.redisTimeSeries

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.commandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delMod {
  
  @JSImport("@redis/time-series/dist/commands/DEL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/DEL", "FIRTS_KEY_INDEX")
  @js.native
  val FIRTS_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], fromTimestamp.asInstanceOf[js.Any], toTimestamp.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
}
