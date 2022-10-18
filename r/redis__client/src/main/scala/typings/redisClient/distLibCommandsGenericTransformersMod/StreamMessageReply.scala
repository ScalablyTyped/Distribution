package typings.redisClient.distLibCommandsGenericTransformersMod

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamMessageReply extends StObject {
  
  var id: RedisCommandArgument
  
  var message: Record[String, RedisCommandArgument]
}
object StreamMessageReply {
  
  inline def apply(id: RedisCommandArgument, message: Record[String, RedisCommandArgument]): StreamMessageReply = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamMessageReply]
  }
  
  extension [Self <: StreamMessageReply](x: Self) {
    
    inline def setId(value: RedisCommandArgument): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Record[String, RedisCommandArgument]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
