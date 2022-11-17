package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationDrawerClosedAction extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: "Navigation/DRAWER_CLOSED"
}
object NavigationDrawerClosedAction {
  
  inline def apply(): NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/DRAWER_CLOSED")
    __obj.asInstanceOf[NavigationDrawerClosedAction]
  }
  
  extension [Self <: NavigationDrawerClosedAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: "Navigation/DRAWER_CLOSED"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
