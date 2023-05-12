package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.event
import typings.sentryTypes.sentryTypesStrings.profile
import typings.sentryTypes.sentryTypesStrings.transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventItemHeaders extends StObject {
  
  var `type`: event | transaction | profile
}
object EventItemHeaders {
  
  inline def apply(`type`: event | transaction | profile): EventItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: event | transaction | profile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
