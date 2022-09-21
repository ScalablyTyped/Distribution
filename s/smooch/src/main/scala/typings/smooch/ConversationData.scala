package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationData extends StObject {
  
  var conversation: Conversation
}
object ConversationData {
  
  inline def apply(conversation: Conversation): ConversationData = {
    val __obj = js.Dynamic.literal(conversation = conversation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationData]
  }
  
  extension [Self <: ConversationData](x: Self) {
    
    inline def setConversation(value: Conversation): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
  }
}
