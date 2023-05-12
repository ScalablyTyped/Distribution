package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionItemHeaders extends StObject {
  
  var `type`: session
}
object SessionItemHeaders {
  
  inline def apply(): SessionItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("session")
    __obj.asInstanceOf[SessionItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: session): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
