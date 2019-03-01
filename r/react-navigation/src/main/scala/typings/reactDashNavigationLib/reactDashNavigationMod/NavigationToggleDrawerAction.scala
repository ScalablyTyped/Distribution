package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationToggleDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/TOGGLE_DRAWER`
}

object NavigationToggleDrawerAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/TOGGLE_DRAWER`,
    key: java.lang.String = null
  ): NavigationToggleDrawerAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationToggleDrawerAction]
  }
}

