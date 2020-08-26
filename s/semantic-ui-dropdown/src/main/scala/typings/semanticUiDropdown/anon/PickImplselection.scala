package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'selection'> */
@js.native
trait PickImplselection extends js.Object {
  var selection: String = js.native
}

object PickImplselection {
  @scala.inline
  def apply(selection: String): PickImplselection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselection]
  }
  @scala.inline
  implicit class PickImplselectionOps[Self <: PickImplselection] (val x: Self) extends AnyVal {
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
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}

