package typings.steamUser.anon

import typings.steamUser.componentsChatroomMod.ChatRoomGroupState
import typings.steamUser.componentsChatroomMod.UserChatRoomGroupState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chatgroupid extends StObject {
  
  var chat_group_id: String
  
  var state: ChatRoomGroupState
  
  var user_chat_state: UserChatRoomGroupState
}
object Chatgroupid {
  
  inline def apply(chat_group_id: String, state: ChatRoomGroupState, user_chat_state: UserChatRoomGroupState): Chatgroupid = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user_chat_state = user_chat_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chatgroupid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chatgroupid] (val x: Self) extends AnyVal {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setState(value: ChatRoomGroupState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUser_chat_state(value: UserChatRoomGroupState): Self = StObject.set(x, "user_chat_state", value.asInstanceOf[js.Any])
  }
}
