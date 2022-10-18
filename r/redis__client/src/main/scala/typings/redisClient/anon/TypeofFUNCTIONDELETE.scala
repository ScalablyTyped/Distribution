package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFUNCTIONDELETE extends StObject {
  
  def transformArguments(library: String): RedisCommandArguments
  
  def transformReply(): OK
}
object TypeofFUNCTIONDELETE {
  
  inline def apply(transformArguments: String => RedisCommandArguments, transformReply: () => OK): TypeofFUNCTIONDELETE = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofFUNCTIONDELETE]
  }
  
  extension [Self <: TypeofFUNCTIONDELETE](x: Self) {
    
    inline def setTransformArguments(value: String => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
