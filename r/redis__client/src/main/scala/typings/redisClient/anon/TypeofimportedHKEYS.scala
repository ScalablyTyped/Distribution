package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedHKEYS extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): js.Array[RedisCommandArgument]
}
object TypeofimportedHKEYS {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: () => js.Array[RedisCommandArgument]
  ): TypeofimportedHKEYS = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofimportedHKEYS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofimportedHKEYS] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => js.Array[RedisCommandArgument]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
