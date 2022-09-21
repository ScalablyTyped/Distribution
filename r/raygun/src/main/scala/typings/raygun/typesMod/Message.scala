package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var details: MessageDetails
  
  var occurredOn: js.Date
}
object Message {
  
  inline def apply(details: MessageDetails, occurredOn: js.Date): Message = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setDetails(value: MessageDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setOccurredOn(value: js.Date): Self = StObject.set(x, "occurredOn", value.asInstanceOf[js.Any])
  }
}
