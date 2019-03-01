package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCloseDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/CLOSE_DRAWER`
}

object NavigationCloseDrawerAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/CLOSE_DRAWER`,
    key: java.lang.String = null
  ): NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationCloseDrawerAction]
  }
}

