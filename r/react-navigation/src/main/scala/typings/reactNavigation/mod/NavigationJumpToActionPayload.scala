package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationJumpToActionPayload extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  var routeName: String
}
object NavigationJumpToActionPayload {
  
  inline def apply(routeName: String): NavigationJumpToActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToActionPayload]
  }
  
  extension [Self <: NavigationJumpToActionPayload](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
