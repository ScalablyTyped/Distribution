package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNavigation.mod._NavigationAction because Already inherited */ @js.native
trait NavigationInitAction
  extends NavigationStackAction
     with NavigationInitActionPayload
     with NavigationTabAction {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: NavigationSlashINIT = js.native
}
object NavigationInitAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashINIT): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInitAction]
  }
  
  @scala.inline
  implicit class NavigationInitActionMutableBuilder[Self <: NavigationInitAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: NavigationSlashINIT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
