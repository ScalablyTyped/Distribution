package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.ListSide
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedBLMOVE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(
    source: RedisCommandArgument,
    destination: RedisCommandArgument,
    sourceDirection: ListSide,
    destinationDirection: ListSide,
    timeout: Double
  ): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofimportedBLMOVE {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument, ListSide, ListSide, Double) => RedisCommandArguments,
    transformReply: () => RedisCommandArgument | Null
  ): TypeofimportedBLMOVE = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction5(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofimportedBLMOVE]
  }
  
  extension [Self <: TypeofimportedBLMOVE](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(
      value: (RedisCommandArgument, RedisCommandArgument, ListSide, ListSide, Double) => RedisCommandArguments
    ): Self = StObject.set(x, "transformArguments", js.Any.fromFunction5(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
