package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationResetAction
  extends StObject
     with NavigationResetActionPayload
     with NavigationStackAction {
  
  var `type`: NavigationSlashRESET
}
object NavigationResetAction {
  
  inline def apply(actions: js.Array[NavigationNavigateAction], index: Double): NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/RESET")
    __obj.asInstanceOf[NavigationResetAction]
  }
  
  extension [Self <: NavigationResetAction](x: Self) {
    
    inline def setType(value: NavigationSlashRESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
