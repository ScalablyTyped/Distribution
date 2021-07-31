package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashJUMP_TO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationJumpToAction extends StObject {
  
  var key: String
  
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  
  var routeName: String
  
  var `type`: NavigationSlashJUMP_TO
}
object NavigationJumpToAction {
  
  @scala.inline
  def apply(key: String, routeName: String): NavigationJumpToAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/JUMP_TO")
    __obj.asInstanceOf[NavigationJumpToAction]
  }
  
  @scala.inline
  implicit class NavigationJumpToActionMutableBuilder[Self <: NavigationJumpToAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NavigationSlashJUMP_TO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
