package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonsItemProps extends js.Object {
  var children: String = js.native
}

object RadioButtonsItemProps {
  @scala.inline
  def apply(children: String): RadioButtonsItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonsItemProps]
  }
  @scala.inline
  implicit class RadioButtonsItemPropsOps[Self <: RadioButtonsItemProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
  }
  
}

