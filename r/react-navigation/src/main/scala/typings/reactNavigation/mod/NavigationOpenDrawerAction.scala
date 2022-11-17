package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOpenDrawerAction extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: "Navigation/OPEN_DRAWER"
}
object NavigationOpenDrawerAction {
  
  inline def apply(): NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/OPEN_DRAWER")
    __obj.asInstanceOf[NavigationOpenDrawerAction]
  }
  
  extension [Self <: NavigationOpenDrawerAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: "Navigation/OPEN_DRAWER"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
