package typings
package atStorybookApiLib.distModulesAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addon extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `match`: js.UndefOr[js.Function1[/* matchOptions */ MatchOptions, scala.Boolean]] = js.undefined
  var route: js.UndefOr[js.Function1[/* routeOptions */ RouteOptions, java.lang.String]] = js.undefined
  var title: java.lang.String
  var `type`: js.UndefOr[Types] = js.undefined
  def render(renderOptions: RenderOptions): reactLib.reactMod.ReactElement
}

object Addon {
  @scala.inline
  def apply(
    render: RenderOptions => reactLib.reactMod.ReactElement,
    title: java.lang.String,
    id: java.lang.String = null,
    `match`: /* matchOptions */ MatchOptions => scala.Boolean = null,
    route: /* routeOptions */ RouteOptions => java.lang.String = null,
    `type`: Types = null
  ): Addon = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), title = title)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction1(route))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
}

