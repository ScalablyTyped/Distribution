package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPSETEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument, milliseconds: Double, value: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument
}
object TypeofPSETEX {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, Double, RedisCommandArgument) => RedisCommandArguments,
    transformReply: () => RedisCommandArgument
  ): TypeofPSETEX = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofPSETEX]
  }
  
  extension [Self <: TypeofPSETEX](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double, RedisCommandArgument) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
