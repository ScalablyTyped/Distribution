package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, 'transition'> */
@js.native
trait PickImpltransitionTransition extends js.Object {
  var transition: String = js.native
}

object PickImpltransitionTransition {
  @scala.inline
  def apply(transition: String): PickImpltransitionTransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransitionTransition]
  }
  @scala.inline
  implicit class PickImpltransitionTransitionOps[Self <: PickImpltransitionTransition] (val x: Self) extends AnyVal {
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
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
  
}

