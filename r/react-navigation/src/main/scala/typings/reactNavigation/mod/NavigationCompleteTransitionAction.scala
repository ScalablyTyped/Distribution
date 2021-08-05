package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationCompleteTransitionAction
  extends StObject
     with NavigationStackAction {
  
  var key: String
  
  var `type`: NavigationSlashCOMPLETE_TRANSITION
}
object NavigationCompleteTransitionAction {
  
  inline def apply(key: String): NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/COMPLETE_TRANSITION")
    __obj.asInstanceOf[NavigationCompleteTransitionAction]
  }
  
  extension [Self <: NavigationCompleteTransitionAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: NavigationSlashCOMPLETE_TRANSITION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
