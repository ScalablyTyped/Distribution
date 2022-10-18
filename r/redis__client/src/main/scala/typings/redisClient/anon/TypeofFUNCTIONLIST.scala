package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.FunctionListItemReply
import typings.redisClient.distLibCommandsGenericTransformersMod.FunctionListRawItemReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONLIST extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(pattern: String): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[FunctionListRawItemReply]): js.Array[FunctionListItemReply] = js.native
}
