package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowTab'> */
@js.native
trait PickImplallowTab extends js.Object {
  var allowTab: Boolean = js.native
}

object PickImplallowTab {
  @scala.inline
  def apply(allowTab: Boolean): PickImplallowTab = {
    val __obj = js.Dynamic.literal(allowTab = allowTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowTab]
  }
  @scala.inline
  implicit class PickImplallowTabOps[Self <: PickImplallowTab] (val x: Self) extends AnyVal {
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
    def setAllowTab(value: Boolean): Self = this.set("allowTab", value.asInstanceOf[js.Any])
  }
  
}

