package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFUNCTIONKILL extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): OK
}
object TypeofFUNCTIONKILL {
  
  inline def apply(transformArguments: () => RedisCommandArguments, transformReply: () => OK): TypeofFUNCTIONKILL = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofFUNCTIONKILL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFUNCTIONKILL] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
