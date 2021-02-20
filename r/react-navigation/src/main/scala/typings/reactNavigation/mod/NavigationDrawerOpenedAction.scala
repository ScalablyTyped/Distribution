package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_OPENED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawerOpenedAction extends NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: NavigationSlashDRAWER_OPENED = js.native
}
object NavigationDrawerOpenedAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashDRAWER_OPENED): NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerOpenedAction]
  }
  
  @scala.inline
  implicit class NavigationDrawerOpenedActionMutableBuilder[Self <: NavigationDrawerOpenedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: NavigationSlashDRAWER_OPENED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
