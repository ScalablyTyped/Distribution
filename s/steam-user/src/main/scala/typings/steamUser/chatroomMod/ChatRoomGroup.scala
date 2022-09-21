package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRoomGroup extends StObject {
  
  var group_summary: ChatRoomGroupSummary
}
object ChatRoomGroup {
  
  inline def apply(group_summary: ChatRoomGroupSummary): ChatRoomGroup = {
    val __obj = js.Dynamic.literal(group_summary = group_summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomGroup]
  }
  
  extension [Self <: ChatRoomGroup](x: Self) {
    
    inline def setGroup_summary(value: ChatRoomGroupSummary): Self = StObject.set(x, "group_summary", value.asInstanceOf[js.Any])
  }
}
