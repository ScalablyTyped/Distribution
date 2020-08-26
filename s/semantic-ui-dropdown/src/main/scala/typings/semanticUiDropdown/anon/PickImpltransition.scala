package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'transition'> */
@js.native
trait PickImpltransition extends js.Object {
  var transition: auto | String = js.native
}

object PickImpltransition {
  @scala.inline
  def apply(transition: auto | String): PickImpltransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransition]
  }
  @scala.inline
  implicit class PickImpltransitionOps[Self <: PickImpltransition] (val x: Self) extends AnyVal {
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
    def setTransition(value: auto | String): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
  
}

