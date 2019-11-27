package typings.reactDashNavigationDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialRouteName extends js.Object {
  var initialRouteName: js.UndefOr[String] = js.undefined
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object Anon_InitialRouteName {
  @scala.inline
  def apply(
    initialRouteName: String = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): Anon_InitialRouteName = {
    val __obj = js.Dynamic.literal()
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InitialRouteName]
  }
}

