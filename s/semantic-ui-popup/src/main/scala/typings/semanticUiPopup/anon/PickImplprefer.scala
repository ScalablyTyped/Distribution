package typings.semanticUiPopup.anon

import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'prefer'> */
@js.native
trait PickImplprefer extends js.Object {
  var prefer: adjacent | opposite = js.native
}

object PickImplprefer {
  @scala.inline
  def apply(prefer: adjacent | opposite): PickImplprefer = {
    val __obj = js.Dynamic.literal(prefer = prefer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprefer]
  }
  @scala.inline
  implicit class PickImplpreferOps[Self <: PickImplprefer] (val x: Self) extends AnyVal {
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
    def setPrefer(value: adjacent | opposite): Self = this.set("prefer", value.asInstanceOf[js.Any])
  }
  
}

