package typings.atStorybookAddons.distMod

import typings.atStorybookAddons.distTypesMod.Types
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addon extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var `match`: js.UndefOr[js.Function1[/* matchOptions */ MatchOptions, Boolean]] = js.undefined
  var paramKey: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[js.Function1[/* routeOptions */ RouteOptions, String]] = js.undefined
  var title: String
  var `type`: js.UndefOr[Types] = js.undefined
  def render(renderOptions: RenderOptions): ReactElement
}

object Addon {
  @scala.inline
  def apply(
    render: RenderOptions => ReactElement,
    title: String,
    id: String = null,
    `match`: /* matchOptions */ MatchOptions => Boolean = null,
    paramKey: String = null,
    route: /* routeOptions */ RouteOptions => String = null,
    `type`: Types = null
  ): Addon = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), title = title)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (paramKey != null) __obj.updateDynamic("paramKey")(paramKey)
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction1(route))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
}

