package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.check_in
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckInItemHeaders extends StObject {
  
  var `type`: check_in
}
object CheckInItemHeaders {
  
  inline def apply(): CheckInItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("check_in")
    __obj.asInstanceOf[CheckInItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckInItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: check_in): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
