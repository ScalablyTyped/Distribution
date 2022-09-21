package typings.redisClient.anon

import typings.redisClient.aclLOGMod.AclLog
import typings.redisClient.aclLOGMod.AclLogRawReply
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofACLLOG extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(count: Double): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[AclLogRawReply]): js.Array[AclLog] = js.native
}
