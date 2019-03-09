package typings
package reactDashRouterDashConfigLib.reactDashRouterDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig extends js.Object {
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[RouteConfigComponentProps[_]] | reactLib.reactMod.ReactNs.ComponentType[js.Object]
  ] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.ReactNs.Key] = js.undefined
  var location: js.UndefOr[historyLib.historyMod.Location[historyLib.historyMod.LocationState]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object RouteConfig {
  @scala.inline
  def apply(
    component: reactLib.reactMod.ReactNs.ComponentType[RouteConfigComponentProps[_]] | reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] = null,
    path: java.lang.String = null,
    routes: js.Array[RouteConfig] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteConfig = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (path != null) __obj.updateDynamic("path")(path)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RouteConfig]
  }
}

