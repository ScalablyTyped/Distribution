package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBackAction
  extends StObject
     with NavigationBackActionPayload {
  
  var `type`: "Navigation/BACK"
}
object NavigationBackAction {
  
  inline def apply(): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[NavigationBackAction]
  }
  
  extension [Self <: NavigationBackAction](x: Self) {
    
    inline def setType(value: "Navigation/BACK"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
