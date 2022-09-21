package typings.steamUser.anon

import typings.steamUser.chatroomMod.ChatRoomGroupSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chatgroupsummary extends StObject {
  
  var chat_group_summary: ChatRoomGroupSummary
}
object Chatgroupsummary {
  
  inline def apply(chat_group_summary: ChatRoomGroupSummary): Chatgroupsummary = {
    val __obj = js.Dynamic.literal(chat_group_summary = chat_group_summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chatgroupsummary]
  }
  
  extension [Self <: Chatgroupsummary](x: Self) {
    
    inline def setChat_group_summary(value: ChatRoomGroupSummary): Self = StObject.set(x, "chat_group_summary", value.asInstanceOf[js.Any])
  }
}
