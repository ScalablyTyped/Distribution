package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNavigation.mod._NavigationAction because Already inherited */ trait NavigationInitAction
  extends StObject
     with NavigationInitActionPayload
     with NavigationStackAction
     with NavigationTabAction {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: NavigationSlashINIT
}
object NavigationInitAction {
  
  inline def apply(): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/INIT")
    __obj.asInstanceOf[NavigationInitAction]
  }
  
  extension [Self <: NavigationInitAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: NavigationSlashINIT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
