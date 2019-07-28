package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/URI`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationUriAction extends NavigationUriActionPayload {
  var `type`: `Navigation/URI`
}

object NavigationUriAction {
  @scala.inline
  def apply(`type`: `Navigation/URI`, uri: String): NavigationUriAction = {
    val __obj = js.Dynamic.literal(uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavigationUriAction]
  }
}

