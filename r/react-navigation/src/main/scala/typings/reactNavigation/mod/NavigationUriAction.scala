package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashURI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationUriAction
  extends StObject
     with NavigationUriActionPayload {
  
  var `type`: NavigationSlashURI
}
object NavigationUriAction {
  
  inline def apply(uri: String): NavigationUriAction = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/URI")
    __obj.asInstanceOf[NavigationUriAction]
  }
  
  extension [Self <: NavigationUriAction](x: Self) {
    
    inline def setType(value: NavigationSlashURI): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
