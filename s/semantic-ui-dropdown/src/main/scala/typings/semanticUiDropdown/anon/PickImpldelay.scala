package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'delay'> */
@js.native
trait PickImpldelay extends js.Object {
  var delay: DelaySettings = js.native
}

object PickImpldelay {
  @scala.inline
  def apply(delay: DelaySettings): PickImpldelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelay]
  }
  @scala.inline
  implicit class PickImpldelayOps[Self <: PickImpldelay] (val x: Self) extends AnyVal {
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
    def setDelay(value: DelaySettings): Self = this.set("delay", value.asInstanceOf[js.Any])
  }
  
}

