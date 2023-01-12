package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationParticipant extends StObject {
  
  var id: String
  
  var lastRead: Double
  
  var unreadCount: Double
  
  var userId: String
}
object ConversationParticipant {
  
  inline def apply(id: String, lastRead: Double, unreadCount: Double, userId: String): ConversationParticipant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastRead = lastRead.asInstanceOf[js.Any], unreadCount = unreadCount.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversationParticipant] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastRead(value: Double): Self = StObject.set(x, "lastRead", value.asInstanceOf[js.Any])
    
    inline def setUnreadCount(value: Double): Self = StObject.set(x, "unreadCount", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
