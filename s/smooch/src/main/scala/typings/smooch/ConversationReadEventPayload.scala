package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationReadEventPayload extends StObject {
  
  var lastRead: Double
  
  var role: String
  
  // If the conversation was read by the business, the userId property will not exist
  var userId: String
}
object ConversationReadEventPayload {
  
  inline def apply(lastRead: Double, role: String, userId: String): ConversationReadEventPayload = {
    val __obj = js.Dynamic.literal(lastRead = lastRead.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationReadEventPayload]
  }
  
  extension [Self <: ConversationReadEventPayload](x: Self) {
    
    inline def setLastRead(value: Double): Self = StObject.set(x, "lastRead", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
