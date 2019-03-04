package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationUriAction extends NavigationUriActionPayload {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/URI`
}

object NavigationUriAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/URI`,
    uri: java.lang.String
  ): NavigationUriAction = {
    val __obj = js.Dynamic.literal(uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavigationUriAction]
  }
}

