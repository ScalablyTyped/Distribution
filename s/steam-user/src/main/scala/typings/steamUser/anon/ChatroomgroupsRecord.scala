package typings.steamUser.anon

import typings.std.Record
import typings.steamUser.chatroomMod.ChatRoomGroupState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatroomgroupsRecord extends StObject {
  
  var chat_room_groups: Record[String, ChatRoomGroupState]
}
object ChatroomgroupsRecord {
  
  inline def apply(chat_room_groups: Record[String, ChatRoomGroupState]): ChatroomgroupsRecord = {
    val __obj = js.Dynamic.literal(chat_room_groups = chat_room_groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatroomgroupsRecord]
  }
  
  extension [Self <: ChatroomgroupsRecord](x: Self) {
    
    inline def setChat_room_groups(value: Record[String, ChatRoomGroupState]): Self = StObject.set(x, "chat_room_groups", value.asInstanceOf[js.Any])
  }
}
