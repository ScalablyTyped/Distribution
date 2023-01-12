package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoomState extends StObject {
  
  var chat_id: String
  
  var chat_name: String
  
  var last_message: String
  
  var members_in_voice: js.Array[SteamID]
  
  var sort_order: Double
  
  var steamid_last_message: SteamID
  
  var time_last_message: js.Date
  
  var voice_allowed: Boolean
}
object ChatRoomState {
  
  inline def apply(
    chat_id: String,
    chat_name: String,
    last_message: String,
    members_in_voice: js.Array[SteamID],
    sort_order: Double,
    steamid_last_message: SteamID,
    time_last_message: js.Date,
    voice_allowed: Boolean
  ): ChatRoomState = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], chat_name = chat_name.asInstanceOf[js.Any], last_message = last_message.asInstanceOf[js.Any], members_in_voice = members_in_voice.asInstanceOf[js.Any], sort_order = sort_order.asInstanceOf[js.Any], steamid_last_message = steamid_last_message.asInstanceOf[js.Any], time_last_message = time_last_message.asInstanceOf[js.Any], voice_allowed = voice_allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRoomState] (val x: Self) extends AnyVal {
    
    inline def setChat_id(value: String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setChat_name(value: String): Self = StObject.set(x, "chat_name", value.asInstanceOf[js.Any])
    
    inline def setLast_message(value: String): Self = StObject.set(x, "last_message", value.asInstanceOf[js.Any])
    
    inline def setMembers_in_voice(value: js.Array[SteamID]): Self = StObject.set(x, "members_in_voice", value.asInstanceOf[js.Any])
    
    inline def setMembers_in_voiceVarargs(value: SteamID*): Self = StObject.set(x, "members_in_voice", js.Array(value*))
    
    inline def setSort_order(value: Double): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
    
    inline def setSteamid_last_message(value: SteamID): Self = StObject.set(x, "steamid_last_message", value.asInstanceOf[js.Any])
    
    inline def setTime_last_message(value: js.Date): Self = StObject.set(x, "time_last_message", value.asInstanceOf[js.Any])
    
    inline def setVoice_allowed(value: Boolean): Self = StObject.set(x, "voice_allowed", value.asInstanceOf[js.Any])
  }
}
