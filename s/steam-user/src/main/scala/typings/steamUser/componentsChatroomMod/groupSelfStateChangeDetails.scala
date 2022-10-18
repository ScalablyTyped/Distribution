package typings.steamUser.componentsChatroomMod

import typings.steamUser.mod.EChatRoomMemberStateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait groupSelfStateChangeDetails extends StObject {
  
  var chat_group_id: String
  
  var group_summary: ChatRoomGroupSummary
  
  var user_action: EChatRoomMemberStateChange
  
  var user_chat_group_state: UserChatRoomGroupState
}
object groupSelfStateChangeDetails {
  
  inline def apply(
    chat_group_id: String,
    group_summary: ChatRoomGroupSummary,
    user_action: EChatRoomMemberStateChange,
    user_chat_group_state: UserChatRoomGroupState
  ): groupSelfStateChangeDetails = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], group_summary = group_summary.asInstanceOf[js.Any], user_action = user_action.asInstanceOf[js.Any], user_chat_group_state = user_chat_group_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupSelfStateChangeDetails]
  }
  
  extension [Self <: groupSelfStateChangeDetails](x: Self) {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_summary(value: ChatRoomGroupSummary): Self = StObject.set(x, "group_summary", value.asInstanceOf[js.Any])
    
    inline def setUser_action(value: EChatRoomMemberStateChange): Self = StObject.set(x, "user_action", value.asInstanceOf[js.Any])
    
    inline def setUser_chat_group_state(value: UserChatRoomGroupState): Self = StObject.set(x, "user_chat_group_state", value.asInstanceOf[js.Any])
  }
}
