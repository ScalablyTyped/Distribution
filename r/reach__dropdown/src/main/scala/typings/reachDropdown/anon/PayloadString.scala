package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.SET_BUTTON_ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadString
  extends StObject
     with DropdownAction {
  
  var payload: String
  
  var `type`: SET_BUTTON_ID
}
object PayloadString {
  
  inline def apply(payload: String): PayloadString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_BUTTON_ID")
    __obj.asInstanceOf[PayloadString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayloadString] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: SET_BUTTON_ID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
