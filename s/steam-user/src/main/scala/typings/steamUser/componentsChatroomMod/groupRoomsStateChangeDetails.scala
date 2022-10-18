package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait groupRoomsStateChangeDetails extends StObject {
  
  var chat_group_id: String
  
  var chat_rooms: js.Array[ChatRoomState]
  
  var default_chat_id: String
}
object groupRoomsStateChangeDetails {
  
  inline def apply(chat_group_id: String, chat_rooms: js.Array[ChatRoomState], default_chat_id: String): groupRoomsStateChangeDetails = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], chat_rooms = chat_rooms.asInstanceOf[js.Any], default_chat_id = default_chat_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupRoomsStateChangeDetails]
  }
  
  extension [Self <: groupRoomsStateChangeDetails](x: Self) {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setChat_rooms(value: js.Array[ChatRoomState]): Self = StObject.set(x, "chat_rooms", value.asInstanceOf[js.Any])
    
    inline def setChat_roomsVarargs(value: ChatRoomState*): Self = StObject.set(x, "chat_rooms", js.Array(value*))
    
    inline def setDefault_chat_id(value: String): Self = StObject.set(x, "default_chat_id", value.asInstanceOf[js.Any])
  }
}
