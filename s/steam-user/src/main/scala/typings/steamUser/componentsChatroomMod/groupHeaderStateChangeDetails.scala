package typings.steamUser.componentsChatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait groupHeaderStateChangeDetails extends StObject {
  
  var chat_group_id: String
  
  var header_state: ChatRoomGroupHeaderState
}
object groupHeaderStateChangeDetails {
  
  inline def apply(chat_group_id: String, header_state: ChatRoomGroupHeaderState): groupHeaderStateChangeDetails = {
    val __obj = js.Dynamic.literal(chat_group_id = chat_group_id.asInstanceOf[js.Any], header_state = header_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupHeaderStateChangeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: groupHeaderStateChangeDetails] (val x: Self) extends AnyVal {
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setHeader_state(value: ChatRoomGroupHeaderState): Self = StObject.set(x, "header_state", value.asInstanceOf[js.Any])
  }
}
