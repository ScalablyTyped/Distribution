package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationInitAction
  extends StObject
     with NavigationInitActionPayload {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: "Navigation/INIT"
}
object NavigationInitAction {
  
  inline def apply(): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/INIT")
    __obj.asInstanceOf[NavigationInitAction]
  }
  
  extension [Self <: NavigationInitAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: "Navigation/INIT"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
