package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationSetParamsAction
  extends StObject
     with NavigationSetParamsActionPayload {
  
  var `type`: "Navigation/SET_PARAMS"
}
object NavigationSetParamsAction {
  
  inline def apply(key: String, params: NavigationParams): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/SET_PARAMS")
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
  
  extension [Self <: NavigationSetParamsAction](x: Self) {
    
    inline def setType(value: "Navigation/SET_PARAMS"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
