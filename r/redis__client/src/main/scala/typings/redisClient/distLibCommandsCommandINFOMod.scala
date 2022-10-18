package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.CommandRawReply
import typings.redisClient.distLibCommandsGenericTransformersMod.CommandReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsCommandINFOMod {
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND_INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND_INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(commands: js.Array[String]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(commands.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[CommandRawReply | Null]): js.Array[CommandReply | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[CommandReply | Null]]
}
