package typings.redisSearch.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorRawReply
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCURSORREAD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(index: RedisCommandArgument, cursor: Double): RedisCommandArguments
  
  def transformReply(reply: AggregateWithCursorRawReply): AggregateWithCursorReply
}
object TypeofCURSORREAD {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: (RedisCommandArgument, Double) => RedisCommandArguments,
    transformReply: AggregateWithCursorRawReply => AggregateWithCursorReply
  ): TypeofCURSORREAD = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCURSORREAD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCURSORREAD] (val x: Self) extends AnyVal {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (RedisCommandArgument, Double) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: AggregateWithCursorRawReply => AggregateWithCursorReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
