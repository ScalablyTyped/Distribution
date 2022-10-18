package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofACLWHOAMI extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument
}
object TypeofACLWHOAMI {
  
  inline def apply(transformArguments: () => RedisCommandArguments, transformReply: () => RedisCommandArgument): TypeofACLWHOAMI = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofACLWHOAMI]
  }
  
  extension [Self <: TypeofACLWHOAMI](x: Self) {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
