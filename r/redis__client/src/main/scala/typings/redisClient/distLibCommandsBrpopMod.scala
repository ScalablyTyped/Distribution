package typings.redisClient

import typings.redisClient.distLibCommandsBlpopMod.BLPopRawReply
import typings.redisClient.distLibCommandsBlpopMod.BLPopReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBrpopMod {
  
  @JSImport("@redis/client/dist/lib/commands/BRPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BRPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: js.Array[RedisCommandArgument], timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: BLPopRawReply): BLPopReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[BLPopReply]
}
