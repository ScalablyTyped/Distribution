package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.CommandRawReply
import typings.redisClient.distLibCommandsGenericTransformersMod.CommandReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCOMMAND extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(reply: js.Array[CommandRawReply]): js.Array[CommandReply]
}
object TypeofCOMMAND {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: () => RedisCommandArguments,
    transformReply: js.Array[CommandRawReply] => js.Array[CommandReply]
  ): TypeofCOMMAND = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCOMMAND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCOMMAND] (val x: Self) extends AnyVal {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: js.Array[CommandRawReply] => js.Array[CommandReply]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
