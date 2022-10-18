package typings.redisClient.anon

import typings.redisClient.distLibCommandsLinsertMod.LInsertPosition
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLINSERT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(
    key: RedisCommandArgument,
    position: LInsertPosition,
    pivot: RedisCommandArgument,
    element: RedisCommandArgument
  ): RedisCommandArguments
  
  def transformReply(): Double
}
object TypeofLINSERT {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (RedisCommandArgument, LInsertPosition, RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments,
    transformReply: () => Double
  ): TypeofLINSERT = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction4(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofLINSERT]
  }
  
  extension [Self <: TypeofLINSERT](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(
      value: (RedisCommandArgument, LInsertPosition, RedisCommandArgument, RedisCommandArgument) => RedisCommandArguments
    ): Self = StObject.set(x, "transformArguments", js.Any.fromFunction4(value))
    
    inline def setTransformReply(value: () => Double): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
