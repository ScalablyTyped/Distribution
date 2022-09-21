package typings.steamUser.chatroomMod

import typings.steamUser.anon.Deleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Response Interfaces"
//#region "Interfaces"
trait ModifiedMessage extends StObject {
  
  var chat_group_id: String
  
  var chat_id: String
  
  var messages: Deleted
}
object ModifiedMessage {
  
  inline def apply(chat_group_id: String, chat_id: String, messages: Deleted): ModifiedMessage = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], chat_id = chat_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiedMessage]
  }
  
  extension [Self <: ModifiedMessage](x: Self) {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setChat_id(value: String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Deleted): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
