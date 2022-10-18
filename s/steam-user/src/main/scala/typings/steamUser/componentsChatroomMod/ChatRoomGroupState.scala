package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoomGroupState extends StObject {
  
  var chat_rooms: js.Array[ChatRoomState]
  
  var default_chat_id: String
  
  var header_state: ChatRoomGroupHeaderState
  
  var kicked: js.Array[ChatRoomMember]
  
  var members: js.Array[ChatRoomMember]
}
object ChatRoomGroupState {
  
  inline def apply(
    chat_rooms: js.Array[ChatRoomState],
    default_chat_id: String,
    header_state: ChatRoomGroupHeaderState,
    kicked: js.Array[ChatRoomMember],
    members: js.Array[ChatRoomMember]
  ): ChatRoomGroupState = {
    val __obj = js.Dynamic.literal(chat_rooms = chat_rooms.asInstanceOf[js.Any], default_chat_id = default_chat_id.asInstanceOf[js.Any], header_state = header_state.asInstanceOf[js.Any], kicked = kicked.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomGroupState]
  }
  
  extension [Self <: ChatRoomGroupState](x: Self) {
    
    inline def setChat_rooms(value: js.Array[ChatRoomState]): Self = StObject.set(x, "chat_rooms", value.asInstanceOf[js.Any])
    
    inline def setChat_roomsVarargs(value: ChatRoomState*): Self = StObject.set(x, "chat_rooms", js.Array(value*))
    
    inline def setDefault_chat_id(value: String): Self = StObject.set(x, "default_chat_id", value.asInstanceOf[js.Any])
    
    inline def setHeader_state(value: ChatRoomGroupHeaderState): Self = StObject.set(x, "header_state", value.asInstanceOf[js.Any])
    
    inline def setKicked(value: js.Array[ChatRoomMember]): Self = StObject.set(x, "kicked", value.asInstanceOf[js.Any])
    
    inline def setKickedVarargs(value: ChatRoomMember*): Self = StObject.set(x, "kicked", js.Array(value*))
    
    inline def setMembers(value: js.Array[ChatRoomMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: ChatRoomMember*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
