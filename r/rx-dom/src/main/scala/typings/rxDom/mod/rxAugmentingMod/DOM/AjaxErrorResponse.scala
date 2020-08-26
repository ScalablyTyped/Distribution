package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxErrorResponse extends js.Object {
  var originalEvent: Event = js.native
  var status: Double = js.native
  var `type`: String = js.native
  var xhr: XMLHttpRequest = js.native
}

object AjaxErrorResponse {
  @scala.inline
  def apply(originalEvent: Event, status: Double, `type`: String, xhr: XMLHttpRequest): AjaxErrorResponse = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxErrorResponse]
  }
  @scala.inline
  implicit class AjaxErrorResponseOps[Self <: AjaxErrorResponse] (val x: Self) extends AnyVal {
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
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = this.set("xhr", value.asInstanceOf[js.Any])
  }
  
}

