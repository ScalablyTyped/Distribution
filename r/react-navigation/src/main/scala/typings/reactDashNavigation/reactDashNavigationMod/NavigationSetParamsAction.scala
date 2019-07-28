package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/SET_PARAMS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsAction
  extends NavigationStackAction
     with NavigationSetParamsActionPayload {
  var `type`: `Navigation/SET_PARAMS`
}

object NavigationSetParamsAction {
  @scala.inline
  def apply(key: String, `type`: `Navigation/SET_PARAMS`, params: NavigationParams = null): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
}

