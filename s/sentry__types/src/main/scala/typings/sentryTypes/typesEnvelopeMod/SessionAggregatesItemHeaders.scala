package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.sessions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionAggregatesItemHeaders extends StObject {
  
  var `type`: sessions
}
object SessionAggregatesItemHeaders {
  
  inline def apply(): SessionAggregatesItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("sessions")
    __obj.asInstanceOf[SessionAggregatesItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionAggregatesItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: sessions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
