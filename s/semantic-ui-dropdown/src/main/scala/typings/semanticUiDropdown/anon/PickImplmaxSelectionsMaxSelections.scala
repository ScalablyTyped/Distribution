package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'maxSelections'> */
@js.native
trait PickImplmaxSelectionsMaxSelections extends js.Object {
  var maxSelections: String = js.native
}

object PickImplmaxSelectionsMaxSelections {
  @scala.inline
  def apply(maxSelections: String): PickImplmaxSelectionsMaxSelections = {
    val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSelectionsMaxSelections]
  }
  @scala.inline
  implicit class PickImplmaxSelectionsMaxSelectionsOps[Self <: PickImplmaxSelectionsMaxSelections] (val x: Self) extends AnyVal {
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
    def setMaxSelections(value: String): Self = this.set("maxSelections", value.asInstanceOf[js.Any])
  }
  
}

