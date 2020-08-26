package typings.storybookComponents.storyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  error :@storybook/components.@storybook/components/dist/blocks/Story.StoryError | undefined} & @storybook/components.@storybook/components/dist/blocks/Story.CommonProps */
@js.native
trait ErrorProps extends js.Object {
  var error: js.UndefOr[StoryError] = js.native
  var height: js.UndefOr[String] = js.native
  var id: String = js.native
  var title: String = js.native
}

object ErrorProps {
  @scala.inline
  def apply(id: String, title: String): ErrorProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorProps]
  }
  @scala.inline
  implicit class ErrorPropsOps[Self <: ErrorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: StoryError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

