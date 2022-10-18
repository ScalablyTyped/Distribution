package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.SELECT_ITEM_AT_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadType
  extends StObject
     with DropdownAction {
  
  var payload: DropdownRef
  
  var `type`: SELECT_ITEM_AT_INDEX
}
object PayloadType {
  
  inline def apply(payload: DropdownRef): PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_ITEM_AT_INDEX")
    __obj.asInstanceOf[PayloadType]
  }
  
  extension [Self <: PayloadType](x: Self) {
    
    inline def setPayload(value: DropdownRef): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: SELECT_ITEM_AT_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
