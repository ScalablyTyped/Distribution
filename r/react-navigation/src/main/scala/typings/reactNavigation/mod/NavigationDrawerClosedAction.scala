package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_CLOSED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawerClosedAction extends NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: NavigationSlashDRAWER_CLOSED = js.native
}
object NavigationDrawerClosedAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashDRAWER_CLOSED): NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerClosedAction]
  }
  
  @scala.inline
  implicit class NavigationDrawerClosedActionMutableBuilder[Self <: NavigationDrawerClosedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: NavigationSlashDRAWER_CLOSED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
