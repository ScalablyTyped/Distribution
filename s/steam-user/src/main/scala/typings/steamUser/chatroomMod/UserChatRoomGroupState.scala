package typings.steamUser.chatroomMod

import typings.steamUser.mod.EChatRoomNotificationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserChatRoomGroupState extends StObject {
  
  var chat_group_id: String
  
  var desktop_notification_level: EChatRoomNotificationLevel
  
  var mobile_notification_level: EChatRoomNotificationLevel
  
  var time_joined: js.Date
  
  var time_last_group_ack: js.Date | Null
  
  var unread_indicator_muted: Boolean
  
  var user_chat_room_state: js.Array[UserChatRoomState]
}
object UserChatRoomGroupState {
  
  inline def apply(
    chat_group_id: String,
    desktop_notification_level: EChatRoomNotificationLevel,
    mobile_notification_level: EChatRoomNotificationLevel,
    time_joined: js.Date,
    unread_indicator_muted: Boolean,
    user_chat_room_state: js.Array[UserChatRoomState]
  ): UserChatRoomGroupState = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], desktop_notification_level = desktop_notification_level.asInstanceOf[js.Any], mobile_notification_level = mobile_notification_level.asInstanceOf[js.Any], time_joined = time_joined.asInstanceOf[js.Any], unread_indicator_muted = unread_indicator_muted.asInstanceOf[js.Any], user_chat_room_state = user_chat_room_state.asInstanceOf[js.Any], time_last_group_ack = null)
    __obj.asInstanceOf[UserChatRoomGroupState]
  }
  
  extension [Self <: UserChatRoomGroupState](x: Self) {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setDesktop_notification_level(value: EChatRoomNotificationLevel): Self = StObject.set(x, "desktop_notification_level", value.asInstanceOf[js.Any])
    
    inline def setMobile_notification_level(value: EChatRoomNotificationLevel): Self = StObject.set(x, "mobile_notification_level", value.asInstanceOf[js.Any])
    
    inline def setTime_joined(value: js.Date): Self = StObject.set(x, "time_joined", value.asInstanceOf[js.Any])
    
    inline def setTime_last_group_ack(value: js.Date): Self = StObject.set(x, "time_last_group_ack", value.asInstanceOf[js.Any])
    
    inline def setTime_last_group_ackNull: Self = StObject.set(x, "time_last_group_ack", null)
    
    inline def setUnread_indicator_muted(value: Boolean): Self = StObject.set(x, "unread_indicator_muted", value.asInstanceOf[js.Any])
    
    inline def setUser_chat_room_state(value: js.Array[UserChatRoomState]): Self = StObject.set(x, "user_chat_room_state", value.asInstanceOf[js.Any])
    
    inline def setUser_chat_room_stateVarargs(value: UserChatRoomState*): Self = StObject.set(x, "user_chat_room_state", js.Array(value*))
  }
}
