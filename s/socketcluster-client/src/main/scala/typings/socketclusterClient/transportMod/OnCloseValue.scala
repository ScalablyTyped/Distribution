package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCloseValue extends js.Object {
  var code: Double = js.native
  var reason: String = js.native
}

object OnCloseValue {
  @scala.inline
  def apply(code: Double, reason: String): OnCloseValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCloseValue]
  }
  @scala.inline
  implicit class OnCloseValueOps[Self <: OnCloseValue] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

