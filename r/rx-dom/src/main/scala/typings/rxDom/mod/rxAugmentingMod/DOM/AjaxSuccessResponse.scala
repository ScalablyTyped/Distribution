package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSuccessResponse extends js.Object {
  var originalEvent: Event
  var response: js.Any
  var responseType: String
  var status: Double
  var xhr: XMLHttpRequest
}

object AjaxSuccessResponse {
  @scala.inline
  def apply(originalEvent: Event, response: js.Any, responseType: String, status: Double, xhr: XMLHttpRequest): AjaxSuccessResponse = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSuccessResponse]
  }
}

