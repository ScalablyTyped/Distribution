package typings.redisClient.anon

import typings.redisClient.functionLISTWITHCODEMod.FunctionListWithCodeItemReply
import typings.redisClient.functionLISTWITHCODEMod.FunctionListWithCodeRawItemReply
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONLISTWITHC extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(pattern: String): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[FunctionListWithCodeRawItemReply]): js.Array[FunctionListWithCodeItemReply] = js.native
}
