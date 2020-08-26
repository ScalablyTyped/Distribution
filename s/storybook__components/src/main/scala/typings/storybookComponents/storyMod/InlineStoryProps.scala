package typings.storybookComponents.storyMod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  storyFn :react.react.ElementType<any>} & @storybook/components.@storybook/components/dist/blocks/Story.CommonProps */
@js.native
trait InlineStoryProps extends js.Object {
  var height: js.UndefOr[String] = js.native
  var id: String = js.native
  var storyFn: ElementType[_] = js.native
  var title: String = js.native
}

object InlineStoryProps {
  @scala.inline
  def apply(id: String, storyFn: ElementType[_], title: String): InlineStoryProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineStoryProps]
  }
  @scala.inline
  implicit class InlineStoryPropsOps[Self <: InlineStoryProps] (val x: Self) extends AnyVal {
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
    def setStoryFn(value: ElementType[_]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

