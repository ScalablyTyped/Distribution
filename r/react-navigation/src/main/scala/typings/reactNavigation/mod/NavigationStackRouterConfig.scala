package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackRouterConfig extends js.Object {
  var initialRouteKey: js.UndefOr[String] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
}

object NavigationStackRouterConfig {
  @scala.inline
  def apply(
    initialRouteKey: String = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    paths: NavigationPathsConfig = null
  ): NavigationStackRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (initialRouteKey != null) __obj.updateDynamic("initialRouteKey")(initialRouteKey.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackRouterConfig]
  }
}

