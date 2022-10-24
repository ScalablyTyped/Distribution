package typings.redisClient.anon

import typings.redisClient.distLibCommandsAuthMod.AuthOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAUTH extends StObject {
  
  def transformArguments(param0: AuthOptions): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument
}
object TypeofAUTH {
  
  inline def apply(
    transformArguments: AuthOptions => RedisCommandArguments,
    transformReply: () => RedisCommandArgument
  ): TypeofAUTH = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofAUTH]
  }
  
  extension [Self <: TypeofAUTH](x: Self) {
    
    inline def setTransformArguments(value: AuthOptions => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
