package typings
package reactDashRouterDashConfigLib.reactDashRouterDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var component: js.UndefOr[reactLib.reactMod.ComponentType[js.Object | RouteConfigComponentProps[_]]] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var location: js.UndefOr[historyLib.historyMod.Location[historyLib.historyMod.LocationState]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function1[/* props */ RouteConfigComponentProps[_], reactLib.reactMod.ReactNode]
  ] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object RouteConfig {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    component: reactLib.reactMod.ComponentType[js.Object | RouteConfigComponentProps[_]] = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] = null,
    path: java.lang.String = null,
    render: /* props */ RouteConfigComponentProps[_] => reactLib.reactMod.ReactNode = null,
    routes: js.Array[RouteConfig] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (path != null) __obj.updateDynamic("path")(path)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RouteConfig]
  }
}

