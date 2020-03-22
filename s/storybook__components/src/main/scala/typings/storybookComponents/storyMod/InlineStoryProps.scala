package typings.storybookComponents.storyMod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  storyFn  :react.react.ElementType<any>} & @storybook/components.@storybook/components/dist/blocks/Story.CommonProps */
@js.native
trait InlineStoryProps extends js.Object {
  var height: js.UndefOr[String] = js.native
  var id: String = js.native
  var storyFn: ElementType[_] = js.native
  var title: String = js.native
}

object InlineStoryProps {
  @scala.inline
  def apply(id: String, storyFn: ElementType[_], title: String, height: String = null): InlineStoryProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineStoryProps]
  }
}

