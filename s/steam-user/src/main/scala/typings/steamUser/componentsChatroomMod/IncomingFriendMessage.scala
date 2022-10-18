package typings.steamUser.componentsChatroomMod

import typings.std.Record
import typings.steamUser.mod.EChatEntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingFriendMessage extends StObject {
  
  var chat_entry_type: EChatEntryType
  
  var from_limited_account: Boolean
  
  var local_echo: Boolean
  
  var low_priority: Boolean
  
  var message: String
  
  var message_bbcode_parsed: js.Array[String | (Record[String, Any])]
  
  var message_no_bbcode: String
  
  var ordinal: Double
  
  var server_timestamp: js.Date
  
  var steamid_friend: SteamID
}
object IncomingFriendMessage {
  
  inline def apply(
    chat_entry_type: EChatEntryType,
    from_limited_account: Boolean,
    local_echo: Boolean,
    low_priority: Boolean,
    message: String,
    message_bbcode_parsed: js.Array[String | (Record[String, Any])],
    message_no_bbcode: String,
    ordinal: Double,
    server_timestamp: js.Date,
    steamid_friend: SteamID
  ): IncomingFriendMessage = {
    val __obj = js.Dynamic.literal(chat_entry_type = chat_entry_type.asInstanceOf[js.Any], from_limited_account = from_limited_account.asInstanceOf[js.Any], local_echo = local_echo.asInstanceOf[js.Any], low_priority = low_priority.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], message_bbcode_parsed = message_bbcode_parsed.asInstanceOf[js.Any], message_no_bbcode = message_no_bbcode.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], server_timestamp = server_timestamp.asInstanceOf[js.Any], steamid_friend = steamid_friend.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingFriendMessage]
  }
  
  extension [Self <: IncomingFriendMessage](x: Self) {
    
    inline def setChat_entry_type(value: EChatEntryType): Self = StObject.set(x, "chat_entry_type", value.asInstanceOf[js.Any])
    
    inline def setFrom_limited_account(value: Boolean): Self = StObject.set(x, "from_limited_account", value.asInstanceOf[js.Any])
    
    inline def setLocal_echo(value: Boolean): Self = StObject.set(x, "local_echo", value.asInstanceOf[js.Any])
    
    inline def setLow_priority(value: Boolean): Self = StObject.set(x, "low_priority", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessage_bbcode_parsed(value: js.Array[String | (Record[String, Any])]): Self = StObject.set(x, "message_bbcode_parsed", value.asInstanceOf[js.Any])
    
    inline def setMessage_bbcode_parsedVarargs(value: (String | (Record[String, Any]))*): Self = StObject.set(x, "message_bbcode_parsed", js.Array(value*))
    
    inline def setMessage_no_bbcode(value: String): Self = StObject.set(x, "message_no_bbcode", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
    
    inline def setSteamid_friend(value: SteamID): Self = StObject.set(x, "steamid_friend", value.asInstanceOf[js.Any])
  }
}
