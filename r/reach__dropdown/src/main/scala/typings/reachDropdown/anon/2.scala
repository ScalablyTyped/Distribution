package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.OPEN_MENU_CLEARED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with DropdownAction {
  
  var `type`: OPEN_MENU_CLEARED
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("OPEN_MENU_CLEARED")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: OPEN_MENU_CLEARED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
