package typings.stormReactDiagrams.portWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortState extends js.Object {
  var selected: Boolean = js.native
}

object PortState {
  @scala.inline
  def apply(selected: Boolean): PortState = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortState]
  }
  @scala.inline
  implicit class PortStateOps[Self <: PortState] (val x: Self) extends AnyVal {
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
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

