package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, 'siblingLabel'> */
@js.native
trait PickImplsiblingLabel extends js.Object {
  var siblingLabel: String = js.native
}

object PickImplsiblingLabel {
  @scala.inline
  def apply(siblingLabel: String): PickImplsiblingLabel = {
    val __obj = js.Dynamic.literal(siblingLabel = siblingLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsiblingLabel]
  }
  @scala.inline
  implicit class PickImplsiblingLabelOps[Self <: PickImplsiblingLabel] (val x: Self) extends AnyVal {
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
    def setSiblingLabel(value: String): Self = this.set("siblingLabel", value.asInstanceOf[js.Any])
  }
  
}

