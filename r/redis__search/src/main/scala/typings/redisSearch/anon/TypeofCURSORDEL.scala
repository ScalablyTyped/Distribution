package typings.redisSearch.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCURSORDEL extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(index: RedisCommandArgument, cursorId: Double): js.Array[RedisCommandArgument]
  
  def transformReply(): OK
}
object TypeofCURSORDEL {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, Double) => js.Array[RedisCommandArgument],
    transformReply: () => OK
  ): TypeofCURSORDEL = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCURSORDEL]
  }
  
  extension [Self <: TypeofCURSORDEL](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double) => js.Array[RedisCommandArgument]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
