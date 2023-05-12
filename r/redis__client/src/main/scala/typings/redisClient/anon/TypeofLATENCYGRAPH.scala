package typings.redisClient.anon

import typings.redisClient.distLibCommandsLatencyGRAPHMod.EventType
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLATENCYGRAPH extends StObject {
  
  def transformArguments(event: EventType): RedisCommandArguments
  
  def transformReply(): String
}
object TypeofLATENCYGRAPH {
  
  inline def apply(transformArguments: EventType => RedisCommandArguments, transformReply: () => String): TypeofLATENCYGRAPH = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofLATENCYGRAPH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLATENCYGRAPH] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: EventType => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
