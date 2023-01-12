package typings.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messages extends StObject {
  
  var messages: typings.reactBigCalendar.mod.Messages
}
object Messages {
  
  inline def apply(messages: typings.reactBigCalendar.mod.Messages): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: typings.reactBigCalendar.mod.Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
