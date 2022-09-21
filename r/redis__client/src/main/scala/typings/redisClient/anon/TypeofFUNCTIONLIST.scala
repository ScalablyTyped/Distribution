package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.FunctionListItemReply
import typings.redisClient.genericTransformersMod.FunctionListRawItemReply
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONLIST extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(pattern: String): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[FunctionListRawItemReply]): js.Array[FunctionListItemReply] = js.native
}
