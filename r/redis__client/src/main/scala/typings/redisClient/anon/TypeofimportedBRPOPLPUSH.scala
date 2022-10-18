package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedBRPOPLPUSH extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(source: RedisCommandArgument, destination: RedisCommandArgument, timeout: Double): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofimportedBRPOPLPUSH {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument, Double) => RedisCommandArguments,
    transformReply: () => RedisCommandArgument | Null
  ): TypeofimportedBRPOPLPUSH = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofimportedBRPOPLPUSH]
  }
  
  extension [Self <: TypeofimportedBRPOPLPUSH](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument, Double) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
