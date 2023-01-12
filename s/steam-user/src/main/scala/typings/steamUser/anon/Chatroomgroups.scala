package typings.steamUser.anon

import typings.std.Record
import typings.steamUser.componentsChatroomMod.ChatRoomGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chatroomgroups extends StObject {
  
  var chat_room_groups: Record[String, ChatRoomGroup]
}
object Chatroomgroups {
  
  inline def apply(chat_room_groups: Record[String, ChatRoomGroup]): Chatroomgroups = {
    val __obj = js.Dynamic.literal(chat_room_groups = chat_room_groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chatroomgroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chatroomgroups] (val x: Self) extends AnyVal {
    
    inline def setChat_room_groups(value: Record[String, ChatRoomGroup]): Self = StObject.set(x, "chat_room_groups", value.asInstanceOf[js.Any])
  }
}
