package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.downward
import typings.semanticUiDropdown.semanticUiDropdownStrings.upward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'direction'> */
@js.native
trait PickImpldirection extends js.Object {
  var direction: auto | upward | downward = js.native
}

object PickImpldirection {
  @scala.inline
  def apply(direction: auto | upward | downward): PickImpldirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldirection]
  }
  @scala.inline
  implicit class PickImpldirectionOps[Self <: PickImpldirection] (val x: Self) extends AnyVal {
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
    def setDirection(value: auto | upward | downward): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
  
}

