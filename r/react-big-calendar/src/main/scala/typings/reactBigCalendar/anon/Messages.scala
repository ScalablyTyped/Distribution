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
  
  extension [Self <: Messages](x: Self) {
    
    inline def setMessages(value: typings.reactBigCalendar.mod.Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
