package typings.atStorybookAddonDashInfo.atStorybookAddonDashInfoMod

import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapStoryProps extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var storyFn: js.UndefOr[StoryFn[_]] = js.undefined
}

object WrapStoryProps {
  @scala.inline
  def apply(
    context: js.Object = null,
    options: js.Object = null,
    storyFn: /* p */ js.UndefOr[StoryContext] => _ = null
  ): WrapStoryProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (options != null) __obj.updateDynamic("options")(options)
    if (storyFn != null) __obj.updateDynamic("storyFn")(js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[WrapStoryProps]
  }
}

