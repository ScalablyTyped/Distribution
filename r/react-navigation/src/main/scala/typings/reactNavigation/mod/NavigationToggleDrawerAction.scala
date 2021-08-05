package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashTOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationToggleDrawerAction
  extends StObject
     with NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: NavigationSlashTOGGLE_DRAWER
}
object NavigationToggleDrawerAction {
  
  inline def apply(): NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/TOGGLE_DRAWER")
    __obj.asInstanceOf[NavigationToggleDrawerAction]
  }
  
  extension [Self <: NavigationToggleDrawerAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: NavigationSlashTOGGLE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
