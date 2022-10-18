package typings.reachDropdown.anon

import typings.reachDropdown.mod.DropdownAction
import typings.reachDropdown.reachDropdownStrings.CLOSE_MENU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with DropdownAction {
  
  var `type`: CLOSE_MENU
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CLOSE_MENU")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: CLOSE_MENU): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
