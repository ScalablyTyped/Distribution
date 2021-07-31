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
  
  @scala.inline
  def apply(routeName: String): NavigationJumpToActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToActionPayload]
  }
  
  @scala.inline
  implicit class NavigationJumpToActionPayloadMutableBuilder[Self <: NavigationJumpToActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
