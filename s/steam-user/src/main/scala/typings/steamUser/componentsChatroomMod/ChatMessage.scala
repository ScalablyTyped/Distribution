package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "Events"
//#region "Response Interfaces"
trait ChatMessage extends StObject {
  
  var deleted: Boolean
  
  var message: String
  
  var ordinal: Double
  
  var sender: SteamID
  
  var server_message: ServerMessage
  
  var server_timestamp: js.Date
}
object ChatMessage {
  
  inline def apply(
    deleted: Boolean,
    message: String,
    ordinal: Double,
    sender: SteamID,
    server_message: ServerMessage,
    server_timestamp: js.Date
  ): ChatMessage = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], server_message = server_message.asInstanceOf[js.Any], server_timestamp = server_timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessage]
  }
  
  extension [Self <: ChatMessage](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setSender(value: SteamID): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setServer_message(value: ServerMessage): Self = StObject.set(x, "server_message", value.asInstanceOf[js.Any])
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
  }
}
