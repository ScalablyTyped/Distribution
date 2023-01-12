package typings.steamUser.anon

import typings.steamUser.componentsChatroomMod.ChatMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: js.Array[ChatMessage]
  
  var more_available: Boolean
}
object Message {
  
  inline def apply(message: js.Array[ChatMessage], more_available: Boolean): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: js.Array[ChatMessage]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageVarargs(value: ChatMessage*): Self = StObject.set(x, "message", js.Array(value*))
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
  }
}
