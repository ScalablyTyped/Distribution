package typings.redisClient.anon

import typings.redisClient.clientTRACKINGINFOMod.RawReply
import typings.redisClient.clientTRACKINGINFOMod.Reply
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTTRACKINGINFO extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: RawReply): Reply
}
object TypeofCLIENTTRACKINGINFO {
  
  inline def apply(transformArguments: () => RedisCommandArguments, transformReply: RawReply => Reply): TypeofCLIENTTRACKINGINFO = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLIENTTRACKINGINFO]
  }
  
  extension [Self <: TypeofCLIENTTRACKINGINFO](x: Self) {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: RawReply => Reply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
