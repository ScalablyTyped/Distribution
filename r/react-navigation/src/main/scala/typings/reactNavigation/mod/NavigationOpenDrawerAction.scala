package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOpenDrawerAction extends NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: NavigationSlashOPEN_DRAWER = js.native
}
object NavigationOpenDrawerAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashOPEN_DRAWER): NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOpenDrawerAction]
  }
  
  @scala.inline
  implicit class NavigationOpenDrawerActionMutableBuilder[Self <: NavigationOpenDrawerAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: NavigationSlashOPEN_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
