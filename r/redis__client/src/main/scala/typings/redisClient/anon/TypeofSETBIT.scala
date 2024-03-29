package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.BitValue
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSETBIT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument, offset: Double, value: BitValue): RedisCommandArguments
  
  def transformReply(): BitValue
}
object TypeofSETBIT {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, Double, BitValue) => RedisCommandArguments,
    transformReply: () => BitValue
  ): TypeofSETBIT = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofSETBIT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSETBIT] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double, BitValue) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: () => BitValue): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
