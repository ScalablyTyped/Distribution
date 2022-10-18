package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessageReply
import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
  var messages: StreamMessagesReply
  
  var name: RedisCommandArgument
}
object Messages {
  
  inline def apply(messages: StreamMessagesReply, name: RedisCommandArgument): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  extension [Self <: Messages](x: Self) {
    
    inline def setMessages(value: StreamMessagesReply): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: StreamMessageReply*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setName(value: RedisCommandArgument): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
