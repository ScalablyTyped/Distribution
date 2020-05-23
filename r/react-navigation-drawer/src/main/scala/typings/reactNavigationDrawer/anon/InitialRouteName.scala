package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialRouteName extends js.Object {
  var initialRouteName: js.UndefOr[String] = js.undefined
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object InitialRouteName {
  @scala.inline
  def apply(
    initialRouteName: String = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): InitialRouteName = {
    val __obj = js.Dynamic.literal()
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRouteName]
  }
}

