package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsEchoMod {
  
  @JSImport("@redis/client/dist/lib/commands/ECHO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ECHO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(message: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(message.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
}
