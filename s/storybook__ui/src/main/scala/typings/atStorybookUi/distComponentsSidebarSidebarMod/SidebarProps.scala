package typings.atStorybookUi.distComponentsSidebarSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var loading: js.UndefOr[Boolean] = js.undefined
  var menu: js.Array[_]
  var menuHighlighted: js.UndefOr[Boolean] = js.undefined
  var stories: /* import warning: ImportType.apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  var storyId: js.UndefOr[String] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(
    menu: js.Array[_],
    stories: /* import warning: ImportType.apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuHighlighted: js.UndefOr[Boolean] = js.undefined,
    storyId: String = null
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(menu = menu, stories = stories)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(menuHighlighted)) __obj.updateDynamic("menuHighlighted")(menuHighlighted)
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    __obj.asInstanceOf[SidebarProps]
  }
}

