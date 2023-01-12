package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.CommandRawReply
import typings.redisClient.distLibCommandsGenericTransformersMod.CommandReply
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCOMMANDINFO extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(commands: js.Array[String]): RedisCommandArguments
  
  def transformReply(reply: js.Array[CommandRawReply | Null]): js.Array[CommandReply | Null]
}
object TypeofCOMMANDINFO {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: js.Array[String] => RedisCommandArguments,
    transformReply: js.Array[CommandRawReply | Null] => js.Array[CommandReply | Null]
  ): TypeofCOMMANDINFO = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCOMMANDINFO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCOMMANDINFO] (val x: Self) extends AnyVal {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: js.Array[String] => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: js.Array[CommandRawReply | Null] => js.Array[CommandReply | Null]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
