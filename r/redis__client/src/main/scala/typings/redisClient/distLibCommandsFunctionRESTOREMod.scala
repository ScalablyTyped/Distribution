package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.APPEND
import typings.redisClient.redisClientStrings.FLUSH
import typings.redisClient.redisClientStrings.OK
import typings.redisClient.redisClientStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFunctionRESTOREMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_RESTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(dump: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dump.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(dump: RedisCommandArgument, mode: FLUSH | APPEND | REPLACE): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dump.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
