package typings.storybookComponents.storyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  error ? :@storybook/components.@storybook/components/dist/blocks/Story.StoryError} & @storybook/components.@storybook/components/dist/blocks/Story.CommonProps */
@js.native
trait ErrorProps extends js.Object {
  var error: js.UndefOr[StoryError] = js.native
  var height: js.UndefOr[String] = js.native
  var id: String = js.native
  var title: String = js.native
}

object ErrorProps {
  @scala.inline
  def apply(id: String, title: String, error: StoryError = null, height: String = null): ErrorProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorProps]
  }
}

