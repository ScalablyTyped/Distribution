package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popup'> */
@js.native
trait PickImplpopupPopup extends js.Object {
  var popup: String = js.native
}

object PickImplpopupPopup {
  @scala.inline
  def apply(popup: String): PickImplpopupPopup = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupPopup]
  }
  @scala.inline
  implicit class PickImplpopupPopupOps[Self <: PickImplpopupPopup] (val x: Self) extends AnyVal {
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
    def setPopup(value: String): Self = this.set("popup", value.asInstanceOf[js.Any])
  }
  
}

