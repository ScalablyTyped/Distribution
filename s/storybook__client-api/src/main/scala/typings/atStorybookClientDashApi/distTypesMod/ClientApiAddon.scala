package typings.atStorybookClientDashApi.distTypesMod

import typings.atStorybookAddons.distMod.Addon
import typings.atStorybookAddons.distMod.MatchOptions
import typings.atStorybookAddons.distMod.RenderOptions
import typings.atStorybookAddons.distMod.RouteOptions
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookAddons.distTypesMod.Types
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApiAddon[StoryFnReturnType] extends Addon {
  @JSName("apply")
  def apply(a: StoryApi[StoryFnReturnType], b: js.Array[_]): js.Any
}

object ClientApiAddon {
  @scala.inline
  def apply[StoryFnReturnType](
    apply: (StoryApi[StoryFnReturnType], js.Array[_]) => js.Any,
    render: RenderOptions => ReactElement,
    title: String,
    id: String = null,
    `match`: /* matchOptions */ MatchOptions => Boolean = null,
    paramKey: String = null,
    route: /* routeOptions */ RouteOptions => String = null,
    `type`: Types = null
  ): ClientApiAddon[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), render = js.Any.fromFunction1(render), title = title)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (paramKey != null) __obj.updateDynamic("paramKey")(paramKey)
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction1(route))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiAddon[StoryFnReturnType]]
  }
}

