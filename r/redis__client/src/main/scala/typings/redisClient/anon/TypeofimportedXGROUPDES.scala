package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedXGROUPDES extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double
  
  def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(reply: Double): Boolean
}
object TypeofimportedXGROUPDES {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 2 */ Double,
    transformArguments: (RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments,
    transformReply: Double => Boolean
  ): TypeofimportedXGROUPDES = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedXGROUPDES]
  }
  
  extension [Self <: TypeofimportedXGROUPDES](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 2 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: Double => Boolean): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
