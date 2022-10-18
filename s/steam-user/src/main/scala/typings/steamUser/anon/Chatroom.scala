package typings.steamUser.anon

import typings.steamUser.componentsChatroomMod.ChatRoomState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chatroom extends StObject {
  
  var chat_room: ChatRoomState
}
object Chatroom {
  
  inline def apply(chat_room: ChatRoomState): Chatroom = {
    val __obj = js.Dynamic.literal(chat_room = chat_room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chatroom]
  }
  
  extension [Self <: Chatroom](x: Self) {
    
    inline def setChat_room(value: ChatRoomState): Self = StObject.set(x, "chat_room", value.asInstanceOf[js.Any])
  }
}
