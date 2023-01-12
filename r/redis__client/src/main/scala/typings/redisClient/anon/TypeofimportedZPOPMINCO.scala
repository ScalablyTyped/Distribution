package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedZPOPMINCO extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument, count: Double): RedisCommandArguments
  
  def transformReply(reply: js.Array[RedisCommandArgument]): js.Array[ZMember]
}
object TypeofimportedZPOPMINCO {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, Double) => RedisCommandArguments,
    transformReply: js.Array[RedisCommandArgument] => js.Array[ZMember]
  ): TypeofimportedZPOPMINCO = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedZPOPMINCO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofimportedZPOPMINCO] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: js.Array[RedisCommandArgument] => js.Array[ZMember]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
