package typings.atStorybookAddonDashInfo.atStorybookAddonDashInfoMod

import typings.atStorybookReact.atStorybookReactMod.RenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapStoryProps extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var storyFn: js.UndefOr[RenderFunction] = js.undefined
}

object WrapStoryProps {
  @scala.inline
  def apply(context: js.Object = null, options: js.Object = null, storyFn: RenderFunction = null): WrapStoryProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (options != null) __obj.updateDynamic("options")(options)
    if (storyFn != null) __obj.updateDynamic("storyFn")(storyFn)
    __obj.asInstanceOf[WrapStoryProps]
  }
}

