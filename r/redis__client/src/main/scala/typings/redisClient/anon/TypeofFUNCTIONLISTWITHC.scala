package typings.redisClient.anon

import typings.redisClient.distLibCommandsFunctionLISTWITHCODEMod.FunctionListWithCodeItemReply
import typings.redisClient.distLibCommandsFunctionLISTWITHCODEMod.FunctionListWithCodeRawItemReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONLISTWITHC extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(pattern: String): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[FunctionListWithCodeRawItemReply]): js.Array[FunctionListWithCodeItemReply] = js.native
}
