package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/JUMP_TO`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationJumpToAction extends js.Object {
  var key: String
  var params: js.UndefOr[NavigationParams] = js.undefined
  var preserveFocus: Boolean
  var routeName: String
  var `type`: `Navigation/JUMP_TO`
}

object NavigationJumpToAction {
  @scala.inline
  def apply(
    key: String,
    preserveFocus: Boolean,
    routeName: String,
    `type`: `Navigation/JUMP_TO`,
    params: NavigationParams = null
  ): NavigationJumpToAction = {
    val __obj = js.Dynamic.literal(key = key, preserveFocus = preserveFocus, routeName = routeName)
    __obj.updateDynamic("type")(`type`)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationJumpToAction]
  }
}

