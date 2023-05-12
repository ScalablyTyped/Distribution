package typings.redisClient.anon

import typings.redisClient.distLibCommandsClientINFOMod.ClientInfoReply
import typings.redisClient.distLibCommandsClientLISTMod.ListFilter
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLIENTLIST extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(filter: ListFilter): RedisCommandArguments = js.native
  
  def transformReply(rawReply: String): js.Array[ClientInfoReply] = js.native
}
