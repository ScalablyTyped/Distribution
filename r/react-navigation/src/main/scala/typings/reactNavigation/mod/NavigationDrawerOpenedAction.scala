package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationDrawerOpenedAction extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: "Navigation/DRAWER_OPENED"
}
object NavigationDrawerOpenedAction {
  
  inline def apply(): NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/DRAWER_OPENED")
    __obj.asInstanceOf[NavigationDrawerOpenedAction]
  }
  
  extension [Self <: NavigationDrawerOpenedAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: "Navigation/DRAWER_OPENED"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
