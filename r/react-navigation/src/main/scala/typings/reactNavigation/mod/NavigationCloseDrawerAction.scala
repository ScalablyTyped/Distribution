package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationCloseDrawerAction
  extends StObject
     with NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: NavigationSlashCLOSE_DRAWER
}
object NavigationCloseDrawerAction {
  
  inline def apply(): NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/CLOSE_DRAWER")
    __obj.asInstanceOf[NavigationCloseDrawerAction]
  }
  
  extension [Self <: NavigationCloseDrawerAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: NavigationSlashCLOSE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
