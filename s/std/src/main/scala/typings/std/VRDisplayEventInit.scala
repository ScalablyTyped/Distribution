package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRDisplayEventInit extends EventInit {
  var display: VRDisplay = js.native
  var reason: js.UndefOr[VRDisplayEventReason] = js.native
}

object VRDisplayEventInit {
  @scala.inline
  def apply(display: VRDisplay): VRDisplayEventInit = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRDisplayEventInit]
  }
  @scala.inline
  implicit class VRDisplayEventInitOps[Self <: VRDisplayEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplay(value: VRDisplay): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: VRDisplayEventReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

