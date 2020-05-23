package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonpErrorResponse extends js.Object {
  var originalEvent: Event
  var status: Double
  var `type`: String
}

object JsonpErrorResponse {
  @scala.inline
  def apply(originalEvent: Event, status: Double, `type`: String): JsonpErrorResponse = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpErrorResponse]
  }
}

