package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRANDOMKEY extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofRANDOMKEY {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: () => RedisCommandArguments,
    transformReply: () => RedisCommandArgument | Null
  ): TypeofRANDOMKEY = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofRANDOMKEY]
  }
  
  extension [Self <: TypeofRANDOMKEY](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
