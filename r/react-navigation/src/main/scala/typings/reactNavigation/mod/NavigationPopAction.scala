package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationPopAction
  extends StObject
     with NavigationPopActionPayload
     with NavigationStackAction {
  
  var `type`: NavigationSlashPOP
}
object NavigationPopAction {
  
  inline def apply(): NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/POP")
    __obj.asInstanceOf[NavigationPopAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationPopAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: NavigationSlashPOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
