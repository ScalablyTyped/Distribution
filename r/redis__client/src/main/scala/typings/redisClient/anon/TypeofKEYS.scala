package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofKEYS extends StObject {
  
  def transformArguments(pattern: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): js.Array[RedisCommandArgument]
}
object TypeofKEYS {
  
  inline def apply(
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: () => js.Array[RedisCommandArgument]
  ): TypeofKEYS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofKEYS]
  }
  
  extension [Self <: TypeofKEYS](x: Self) {
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => js.Array[RedisCommandArgument]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
