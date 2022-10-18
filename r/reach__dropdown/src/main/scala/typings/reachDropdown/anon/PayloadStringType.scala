package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.SEARCH_FOR_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadStringType
  extends StObject
     with DropdownAction {
  
  var payload: String
  
  var `type`: SEARCH_FOR_ITEM
}
object PayloadStringType {
  
  inline def apply(payload: String): PayloadStringType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SEARCH_FOR_ITEM")
    __obj.asInstanceOf[PayloadStringType]
  }
  
  extension [Self <: PayloadStringType](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: SEARCH_FOR_ITEM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
