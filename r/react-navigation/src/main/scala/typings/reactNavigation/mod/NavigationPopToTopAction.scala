package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationPopToTopAction
  extends StObject
     with NavigationPopToTopActionPayload
     with NavigationStackAction {
  
  var `type`: NavigationSlashPOP_TO_TOP
}
object NavigationPopToTopAction {
  
  inline def apply(): NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP_TO_TOP")
    __obj.asInstanceOf[NavigationPopToTopAction]
  }
  
  extension [Self <: NavigationPopToTopAction](x: Self) {
    
    inline def setType(value: NavigationSlashPOP_TO_TOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
