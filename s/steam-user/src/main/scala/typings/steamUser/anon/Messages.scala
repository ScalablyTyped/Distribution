package typings.steamUser.anon

import typings.steamUser.chatroomMod.FriendMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
  var messages: js.Array[FriendMessage]
  
  var more_available: Boolean
}
object Messages {
  
  inline def apply(messages: js.Array[FriendMessage], more_available: Boolean): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  extension [Self <: Messages](x: Self) {
    
    inline def setMessages(value: js.Array[FriendMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: FriendMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
  }
}
