package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashURI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationUriAction extends NavigationUriActionPayload {
  var `type`: NavigationSlashURI
}

object NavigationUriAction {
  @scala.inline
  def apply(`type`: NavigationSlashURI, uri: String): NavigationUriAction = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationUriAction]
  }
}

