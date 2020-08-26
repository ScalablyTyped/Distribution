package typings.storybookReact.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorybookStory extends js.Object {
  var name: String = js.native
  def render(): js.Any = js.native
}

object IStorybookStory {
  @scala.inline
  def apply(name: String, render: () => js.Any): IStorybookStory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[IStorybookStory]
  }
  @scala.inline
  implicit class IStorybookStoryOps[Self <: IStorybookStory] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: () => js.Any): Self = this.set("render", js.Any.fromFunction0(value))
  }
  
}

