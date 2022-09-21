package typings.steamUser.chatroomMod

import typings.steamUser.mod.EChatRoomMemberStateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait groupMemberStateChangeDetails extends StObject {
  
  var change: EChatRoomMemberStateChange
  
  var chat_group_id: String
  
  var member: ChatRoomMember
}
object groupMemberStateChangeDetails {
  
  inline def apply(change: EChatRoomMemberStateChange, chat_group_id: String, member: ChatRoomMember): groupMemberStateChangeDetails = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], chat_group_id = chat_group_id.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any])
    __obj.asInstanceOf[groupMemberStateChangeDetails]
  }
  
  extension [Self <: groupMemberStateChangeDetails](x: Self) {
    
    inline def setChange(value: EChatRoomMemberStateChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChat_group_id(value: String): Self = StObject.set(x, "chat_group_id", value.asInstanceOf[js.Any])
    
    inline def setMember(value: ChatRoomMember): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
  }
}
