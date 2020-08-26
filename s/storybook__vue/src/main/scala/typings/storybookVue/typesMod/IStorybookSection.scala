package typings.storybookVue.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorybookSection extends js.Object {
  var kind: String = js.native
  var stories: js.Array[IStorybookStory] = js.native
}

object IStorybookSection {
  @scala.inline
  def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorybookSection]
  }
  @scala.inline
  implicit class IStorybookSectionOps[Self <: IStorybookSection] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoriesVarargs(value: IStorybookStory*): Self = this.set("stories", js.Array(value :_*))
    @scala.inline
    def setStories(value: js.Array[IStorybookStory]): Self = this.set("stories", value.asInstanceOf[js.Any])
  }
  
}

