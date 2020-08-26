package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'popup'> */
@js.native
trait PickImplpopup extends js.Object {
  var popup: `false` | String | JQuery = js.native
}

object PickImplpopup {
  @scala.inline
  def apply(popup: `false` | String | JQuery): PickImplpopup = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopup]
  }
  @scala.inline
  implicit class PickImplpopupOps[Self <: PickImplpopup] (val x: Self) extends AnyVal {
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
    def setPopup(value: `false` | String | JQuery): Self = this.set("popup", value.asInstanceOf[js.Any])
  }
  
}

