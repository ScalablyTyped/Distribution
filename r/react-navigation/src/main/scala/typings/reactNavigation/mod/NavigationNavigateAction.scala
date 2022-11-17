package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigateAction
  extends StObject
     with NavigationNavigateActionPayload {
  
  var `type`: "Navigation/NAVIGATE"
}
object NavigationNavigateAction {
  
  inline def apply(routeName: String): NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/NAVIGATE")
    __obj.asInstanceOf[NavigationNavigateAction]
  }
  
  extension [Self <: NavigationNavigateAction](x: Self) {
    
    inline def setType(value: "Navigation/NAVIGATE"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
