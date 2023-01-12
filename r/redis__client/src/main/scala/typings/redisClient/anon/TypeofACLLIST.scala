package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLLIST extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): js.Array[RedisCommandArgument]
}
object TypeofACLLIST {
  
  inline def apply(
    transformArguments: () => RedisCommandArguments,
    transformReply: () => js.Array[RedisCommandArgument]
  ): TypeofACLLIST = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofACLLIST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofACLLIST] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => js.Array[RedisCommandArgument]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
