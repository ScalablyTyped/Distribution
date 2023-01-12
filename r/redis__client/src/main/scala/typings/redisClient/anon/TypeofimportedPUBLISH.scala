package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedPUBLISH extends StObject {
  
  def transformArguments(channel: RedisCommandArgument, message: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): Double
}
object TypeofimportedPUBLISH {
  
  inline def apply(
    transformArguments: (RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments,
    transformReply: () => Double
  ): TypeofimportedPUBLISH = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofimportedPUBLISH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofimportedPUBLISH] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => Double): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
