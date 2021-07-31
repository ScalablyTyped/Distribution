package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashOPEN_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOpenDrawerAction
  extends StObject
     with NavigationDrawerAction {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: NavigationSlashOPEN_DRAWER
}
object NavigationOpenDrawerAction {
  
  @scala.inline
  def apply(): NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/OPEN_DRAWER")
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
