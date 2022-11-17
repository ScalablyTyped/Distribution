package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationPopAction
  extends StObject
     with NavigationPopActionPayload {
  
  var `type`: "Navigation/POP"
}
object NavigationPopAction {
  
  inline def apply(): NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP")
    __obj.asInstanceOf[NavigationPopAction]
  }
  
  extension [Self <: NavigationPopAction](x: Self) {
    
    inline def setType(value: "Navigation/POP"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
