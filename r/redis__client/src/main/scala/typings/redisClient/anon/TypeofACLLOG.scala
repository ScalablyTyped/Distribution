package typings.redisClient.anon

import typings.redisClient.distLibCommandsAclLOGMod.AclLog
import typings.redisClient.distLibCommandsAclLOGMod.AclLogRawReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofACLLOG extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(count: Double): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[AclLogRawReply]): js.Array[AclLog] = js.native
}
