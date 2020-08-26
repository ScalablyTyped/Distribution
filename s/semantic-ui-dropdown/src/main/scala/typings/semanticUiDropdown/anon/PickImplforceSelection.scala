package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'forceSelection'> */
@js.native
trait PickImplforceSelection extends js.Object {
  var forceSelection: Boolean = js.native
}

object PickImplforceSelection {
  @scala.inline
  def apply(forceSelection: Boolean): PickImplforceSelection = {
    val __obj = js.Dynamic.literal(forceSelection = forceSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplforceSelection]
  }
  @scala.inline
  implicit class PickImplforceSelectionOps[Self <: PickImplforceSelection] (val x: Self) extends AnyVal {
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
    def setForceSelection(value: Boolean): Self = this.set("forceSelection", value.asInstanceOf[js.Any])
  }
  
}

