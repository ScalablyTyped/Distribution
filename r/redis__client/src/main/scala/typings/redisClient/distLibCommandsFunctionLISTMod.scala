package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.FunctionListItemReply
import typings.redisClient.distLibCommandsGenericTransformersMod.FunctionListRawItemReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFunctionLISTMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_LIST", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(pattern: String): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(pattern.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[FunctionListRawItemReply]): js.Array[FunctionListItemReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[FunctionListItemReply]]
}
