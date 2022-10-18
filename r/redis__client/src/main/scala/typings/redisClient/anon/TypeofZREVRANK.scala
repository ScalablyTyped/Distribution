package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofZREVRANK extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: RedisCommandArgument, member: RedisCommandArgument): RedisCommandArguments
  
  def transformReply(): Double | Null
}
object TypeofZREVRANK {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: (RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments,
    transformReply: () => Double | Null
  ): TypeofZREVRANK = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofZREVRANK]
  }
  
  extension [Self <: TypeofZREVRANK](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => Double | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
