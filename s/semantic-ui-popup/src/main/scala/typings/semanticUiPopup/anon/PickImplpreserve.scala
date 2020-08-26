package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'preserve'> */
@js.native
trait PickImplpreserve extends js.Object {
  var preserve: Boolean = js.native
}

object PickImplpreserve {
  @scala.inline
  def apply(preserve: Boolean): PickImplpreserve = {
    val __obj = js.Dynamic.literal(preserve = preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpreserve]
  }
  @scala.inline
  implicit class PickImplpreserveOps[Self <: PickImplpreserve] (val x: Self) extends AnyVal {
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
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
  }
  
}

