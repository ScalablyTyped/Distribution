package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingChatMessage extends StObject {
  
  var chat_group_id: String
  
  var chat_id: String
  
  var chat_name: String
  
  var mentions: ChatMentions | Null
  
  var message: String
  
  var message_no_bbcode: String
  
  var ordinal: Double
  
  var server_message: ServerMessage | Null
  
  var server_timestamp: js.Date
  
  var steamid_sender: SteamID
}
object IncomingChatMessage {
  
  inline def apply(
    chat_group_id: String,
    chat_id: String,
    chat_name: String,
    message: String,
    message_no_bbcode: String,
    ordinal: Double,
    server_timestamp: js.Date,
    steamid_sender: SteamID
  ): IncomingChatMessage = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], chat_id = chat_id.asInstanceOf[js.Any], chat_name = chat_name.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], message_no_bbcode = message_no_bbcode.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], server_timestamp = server_timestamp.asInstanceOf[js.Any], steamid_sender = steamid_sender.asInstanceOf[js.Any], mentions = null, server_message = null)
    __obj.asInstanceOf[IncomingChatMessage]
  }
  
  extension [Self <: IncomingChatMessage](x: Self) {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setChat_id(value: String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setChat_name(value: String): Self = StObject.set(x, "chat_name", value.asInstanceOf[js.Any])
    
    inline def setMentions(value: ChatMentions): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsNull: Self = StObject.set(x, "mentions", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessage_no_bbcode(value: String): Self = StObject.set(x, "message_no_bbcode", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setServer_message(value: ServerMessage): Self = StObject.set(x, "server_message", value.asInstanceOf[js.Any])
    
    inline def setServer_messageNull: Self = StObject.set(x, "server_message", null)
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
    
    inline def setSteamid_sender(value: SteamID): Self = StObject.set(x, "steamid_sender", value.asInstanceOf[js.Any])
  }
}
