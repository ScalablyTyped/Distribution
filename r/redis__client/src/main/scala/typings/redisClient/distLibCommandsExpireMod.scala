package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.GT
import typings.redisClient.redisClientStrings.LT
import typings.redisClient.redisClientStrings.NX
import typings.redisClient.redisClientStrings.XX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsExpireMod {
  
  @JSImport("@redis/client/dist/lib/commands/EXPIRE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/EXPIRE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, seconds: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, seconds: Double, mode: NX | XX | GT | LT): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
