package typings.reactDashRouterDashConfig.reactDashRouterDashConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig
  extends /* propName */ StringDictionary[js.Any] {
  var component: js.UndefOr[ComponentType[js.Object | RouteConfigComponentProps[_]]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var path: js.UndefOr[String | js.Array[String]] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouteConfigComponentProps[_], ReactNode]] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteConfig {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    component: ComponentType[js.Object | RouteConfigComponentProps[_]] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteConfigComponentProps[_] => ReactNode = null,
    routes: js.Array[RouteConfig] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouteConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RouteConfig]
  }
}

