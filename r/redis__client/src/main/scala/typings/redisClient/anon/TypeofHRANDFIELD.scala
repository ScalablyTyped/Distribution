package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHRANDFIELD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): RedisCommandArgument | Null
}
object TypeofHRANDFIELD {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: RedisCommandArgument => RedisCommandArguments,
    transformReply: () => RedisCommandArgument | Null
  ): TypeofHRANDFIELD = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofHRANDFIELD]
  }
  
  extension [Self <: TypeofHRANDFIELD](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: RedisCommandArgument => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => RedisCommandArgument | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
