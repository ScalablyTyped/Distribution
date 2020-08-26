package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'target'> */
@js.native
trait PickImpltarget extends js.Object {
  var target: `false` | String | JQuery = js.native
}

object PickImpltarget {
  @scala.inline
  def apply(target: `false` | String | JQuery): PickImpltarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltarget]
  }
  @scala.inline
  implicit class PickImpltargetOps[Self <: PickImpltarget] (val x: Self) extends AnyVal {
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
    def setTarget(value: `false` | String | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

