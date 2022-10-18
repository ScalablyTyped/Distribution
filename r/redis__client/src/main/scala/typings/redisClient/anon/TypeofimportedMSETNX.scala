package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsMsetMod.MSetArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedMSETNX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(toSet: MSetArguments): RedisCommandArguments
  
  def transformReply(reply: Double): Boolean
}
object TypeofimportedMSETNX {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: MSetArguments => RedisCommandArguments,
    transformReply: Double => Boolean
  ): TypeofimportedMSETNX = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofimportedMSETNX]
  }
  
  extension [Self <: TypeofimportedMSETNX](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: MSetArguments => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: Double => Boolean): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
