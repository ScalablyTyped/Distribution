package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOpenDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/OPEN_DRAWER`
}

object NavigationOpenDrawerAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/OPEN_DRAWER`,
    key: java.lang.String = null
  ): NavigationOpenDrawerAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationOpenDrawerAction]
  }
}

