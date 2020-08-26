package typings.reactSelect.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseProps extends js.Object {
  var children: js.Any = js.native
  var in: Boolean = js.native
}

object CollapseProps {
  @scala.inline
  def apply(children: js.Any, in: Boolean): CollapseProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
  }
  
}

