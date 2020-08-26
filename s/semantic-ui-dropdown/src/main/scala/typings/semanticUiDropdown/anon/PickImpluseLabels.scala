package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'useLabels'> */
@js.native
trait PickImpluseLabels extends js.Object {
  var useLabels: Boolean = js.native
}

object PickImpluseLabels {
  @scala.inline
  def apply(useLabels: Boolean): PickImpluseLabels = {
    val __obj = js.Dynamic.literal(useLabels = useLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseLabels]
  }
  @scala.inline
  implicit class PickImpluseLabelsOps[Self <: PickImpluseLabels] (val x: Self) extends AnyVal {
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
    def setUseLabels(value: Boolean): Self = this.set("useLabels", value.asInstanceOf[js.Any])
  }
  
}

