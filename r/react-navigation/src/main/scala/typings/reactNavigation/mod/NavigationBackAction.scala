package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBackAction
  extends StObject
     with NavigationBackActionPayload
     with NavigationStackAction
     with NavigationTabAction {
  
  var `type`: NavigationSlashBACK
}
object NavigationBackAction {
  
  inline def apply(): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[NavigationBackAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBackAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: NavigationSlashBACK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
