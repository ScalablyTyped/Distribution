package typings.steamUser.componentsChatroomMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FriendMessage extends StObject {
  
  var message: String
  
  var message_bbcode_parsed: Null | (js.Array[String | (Record[String, Any])])
  
  var ordinal: Double
  
  var sender: SteamID
  
  var server_timestamp: js.Date
}
object FriendMessage {
  
  inline def apply(message: String, ordinal: Double, sender: SteamID, server_timestamp: js.Date): FriendMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], server_timestamp = server_timestamp.asInstanceOf[js.Any], message_bbcode_parsed = null)
    __obj.asInstanceOf[FriendMessage]
  }
  
  extension [Self <: FriendMessage](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessage_bbcode_parsed(value: js.Array[String | (Record[String, Any])]): Self = StObject.set(x, "message_bbcode_parsed", value.asInstanceOf[js.Any])
    
    inline def setMessage_bbcode_parsedNull: Self = StObject.set(x, "message_bbcode_parsed", null)
    
    inline def setMessage_bbcode_parsedVarargs(value: (String | (Record[String, Any]))*): Self = StObject.set(x, "message_bbcode_parsed", js.Array(value*))
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setSender(value: SteamID): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
  }
}
