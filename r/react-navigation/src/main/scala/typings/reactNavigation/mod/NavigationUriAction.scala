package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashURI
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
  implicit class NavigationUriActionOps[Self <: NavigationUriAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: NavigationSlashURI): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
