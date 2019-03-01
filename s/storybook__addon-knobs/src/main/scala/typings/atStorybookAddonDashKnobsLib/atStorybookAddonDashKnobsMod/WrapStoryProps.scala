package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapStoryProps extends js.Object {
  var channel: js.UndefOr[js.Object] = js.undefined
  var context: js.UndefOr[js.Object] = js.undefined
  var initialContent: js.UndefOr[js.Object] = js.undefined
  var knobStore: js.UndefOr[js.Object] = js.undefined
  var storyFn: js.UndefOr[atStorybookReactLib.atStorybookReactMod.RenderFunction] = js.undefined
}

object WrapStoryProps {
  @scala.inline
  def apply(
    channel: js.Object = null,
    context: js.Object = null,
    initialContent: js.Object = null,
    knobStore: js.Object = null,
    storyFn: atStorybookReactLib.atStorybookReactMod.RenderFunction = null
  ): WrapStoryProps = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent)
    if (knobStore != null) __obj.updateDynamic("knobStore")(knobStore)
    if (storyFn != null) __obj.updateDynamic("storyFn")(storyFn)
    __obj.asInstanceOf[WrapStoryProps]
  }
}

