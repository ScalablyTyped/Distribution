package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationCloseDrawerAction extends NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: NavigationSlashCLOSE_DRAWER = js.native
}
object NavigationCloseDrawerAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashCLOSE_DRAWER): NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCloseDrawerAction]
  }
  
  @scala.inline
  implicit class NavigationCloseDrawerActionMutableBuilder[Self <: NavigationCloseDrawerAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: NavigationSlashCLOSE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
