package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsSince extends StObject {
  
  var conversationsSince: js.Date | Double
}
object ConversationsSince {
  
  inline def apply(conversationsSince: js.Date | Double): ConversationsSince = {
    val __obj = js.Dynamic.literal(conversationsSince = conversationsSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversationsSince] (val x: Self) extends AnyVal {
    
    inline def setConversationsSince(value: js.Date | Double): Self = StObject.set(x, "conversationsSince", value.asInstanceOf[js.Any])
  }
}
