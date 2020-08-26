package typings.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'jitter'> */
@js.native
trait PickImpljitter extends js.Object {
  var jitter: Double = js.native
}

object PickImpljitter {
  @scala.inline
  def apply(jitter: Double): PickImpljitter = {
    val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpljitter]
  }
  @scala.inline
  implicit class PickImpljitterOps[Self <: PickImpljitter] (val x: Self) extends AnyVal {
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
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
  }
  
}

