package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'closable'> */
@js.native
trait PickImplclosable extends js.Object {
  var closable: Boolean = js.native
}

object PickImplclosable {
  @scala.inline
  def apply(closable: Boolean): PickImplclosable = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclosable]
  }
  @scala.inline
  implicit class PickImplclosableOps[Self <: PickImplclosable] (val x: Self) extends AnyVal {
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
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
  }
  
}

