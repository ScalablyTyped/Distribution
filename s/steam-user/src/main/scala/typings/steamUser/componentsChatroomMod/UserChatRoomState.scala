package typings.steamUser.componentsChatroomMod

import typings.steamUser.mod.EChatRoomNotificationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserChatRoomState extends StObject {
  
  var chat_id: String
  
  var desktop_notification_level: EChatRoomNotificationLevel
  
  var mobile_notification_level: EChatRoomNotificationLevel
  
  var time_first_unread: js.Date
  
  var time_joined: js.Date
  
  var time_last_ack: js.Date | Null
  
  var time_last_mention: js.Date | Null
  
  var unread_indicator_muted: Boolean
}
object UserChatRoomState {
  
  inline def apply(
    chat_id: String,
    desktop_notification_level: EChatRoomNotificationLevel,
    mobile_notification_level: EChatRoomNotificationLevel,
    time_first_unread: js.Date,
    time_joined: js.Date,
    unread_indicator_muted: Boolean
  ): UserChatRoomState = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], desktop_notification_level = desktop_notification_level.asInstanceOf[js.Any], mobile_notification_level = mobile_notification_level.asInstanceOf[js.Any], time_first_unread = time_first_unread.asInstanceOf[js.Any], time_joined = time_joined.asInstanceOf[js.Any], unread_indicator_muted = unread_indicator_muted.asInstanceOf[js.Any], time_last_ack = null, time_last_mention = null)
    __obj.asInstanceOf[UserChatRoomState]
  }
  
  extension [Self <: UserChatRoomState](x: Self) {
    
    inline def setChat_id(value: String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setDesktop_notification_level(value: EChatRoomNotificationLevel): Self = StObject.set(x, "desktop_notification_level", value.asInstanceOf[js.Any])
    
    inline def setMobile_notification_level(value: EChatRoomNotificationLevel): Self = StObject.set(x, "mobile_notification_level", value.asInstanceOf[js.Any])
    
    inline def setTime_first_unread(value: js.Date): Self = StObject.set(x, "time_first_unread", value.asInstanceOf[js.Any])
    
    inline def setTime_joined(value: js.Date): Self = StObject.set(x, "time_joined", value.asInstanceOf[js.Any])
    
    inline def setTime_last_ack(value: js.Date): Self = StObject.set(x, "time_last_ack", value.asInstanceOf[js.Any])
    
    inline def setTime_last_ackNull: Self = StObject.set(x, "time_last_ack", null)
    
    inline def setTime_last_mention(value: js.Date): Self = StObject.set(x, "time_last_mention", value.asInstanceOf[js.Any])
    
    inline def setTime_last_mentionNull: Self = StObject.set(x, "time_last_mention", null)
    
    inline def setUnread_indicator_muted(value: Boolean): Self = StObject.set(x, "unread_indicator_muted", value.asInstanceOf[js.Any])
  }
}
