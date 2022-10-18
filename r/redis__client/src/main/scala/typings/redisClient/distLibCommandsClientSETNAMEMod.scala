package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsClientSETNAMEMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_SETNAME", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(name: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(name.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
}
