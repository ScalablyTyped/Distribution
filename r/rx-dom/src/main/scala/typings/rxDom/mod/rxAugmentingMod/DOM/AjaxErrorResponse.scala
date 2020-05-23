package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorResponse extends js.Object {
  var originalEvent: Event
  var status: Double
  var `type`: String
  var xhr: XMLHttpRequest
}

object AjaxErrorResponse {
  @scala.inline
  def apply(originalEvent: Event, status: Double, `type`: String, xhr: XMLHttpRequest): AjaxErrorResponse = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxErrorResponse]
  }
}

