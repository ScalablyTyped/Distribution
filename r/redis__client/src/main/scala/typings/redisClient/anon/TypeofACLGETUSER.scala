package typings.redisClient.anon

import typings.redisClient.distLibCommandsAclGETUSERMod.AclGetUserRawReply
import typings.redisClient.distLibCommandsAclGETUSERMod.AclUser
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLGETUSER extends StObject {
  
  def transformArguments(username: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(reply: AclGetUserRawReply): AclUser
}
object TypeofACLGETUSER {
  
  inline def apply(
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: AclGetUserRawReply => AclUser
  ): TypeofACLGETUSER = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofACLGETUSER]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofACLGETUSER] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: AclGetUserRawReply => AclUser): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
