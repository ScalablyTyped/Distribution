package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.ListSide
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBLMOVE extends StObject {
  
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
object TypeofBLMOVE {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument, ListSide, ListSide, Double) => RedisCommandArguments,
    transformReply: () => RedisCommandArgument | Null
  ): TypeofBLMOVE = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction5(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofBLMOVE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBLMOVE] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(
      value: (RedisCommandArgument, RedisCommandArgument, ListSide, ListSide, Double) => RedisCommandArguments
    ): Self = StObject.set(x, "transformArguments", js.Any.fromFunction5(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
