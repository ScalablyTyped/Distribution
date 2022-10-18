package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.OPEN_MENU_AT_FIRST_ITEM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with DropdownAction {
  
  var `type`: OPEN_MENU_AT_FIRST_ITEM
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OPEN_MENU_AT_FIRST_ITEM")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setType(value: OPEN_MENU_AT_FIRST_ITEM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
