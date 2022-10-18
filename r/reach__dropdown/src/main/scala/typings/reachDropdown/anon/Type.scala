package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.CLICK_MENU_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with DropdownAction {
  
  var `type`: CLICK_MENU_ITEM
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CLICK_MENU_ITEM")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: CLICK_MENU_ITEM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
