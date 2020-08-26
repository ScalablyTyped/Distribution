package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'labels'> */
@js.native
trait PickImpllabels extends js.Object {
  var labels: String = js.native
}

object PickImpllabels {
  @scala.inline
  def apply(labels: String): PickImpllabels = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabels]
  }
  @scala.inline
  implicit class PickImpllabelsOps[Self <: PickImpllabels] (val x: Self) extends AnyVal {
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
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
  }
  
}

