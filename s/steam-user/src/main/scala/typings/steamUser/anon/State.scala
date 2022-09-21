package typings.steamUser.anon

import typings.steamUser.chatroomMod.ChatRoomGroupState
import typings.steamUser.chatroomMod.UserChatRoomGroupState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var state: ChatRoomGroupState
  
  var user_chat_state: UserChatRoomGroupState
}
object State {
  
  inline def apply(state: ChatRoomGroupState, user_chat_state: UserChatRoomGroupState): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], user_chat_state = user_chat_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setState(value: ChatRoomGroupState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUser_chat_state(value: UserChatRoomGroupState): Self = StObject.set(x, "user_chat_state", value.asInstanceOf[js.Any])
  }
}
