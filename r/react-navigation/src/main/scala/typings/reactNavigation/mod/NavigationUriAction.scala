package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashURI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationUriAction extends NavigationUriActionPayload {
  
  var `type`: NavigationSlashURI = js.native
}
object NavigationUriAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashURI, uri: String): NavigationUriAction = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationUriAction]
  }
  
  @scala.inline
  implicit class NavigationUriActionMutableBuilder[Self <: NavigationUriAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashURI): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
