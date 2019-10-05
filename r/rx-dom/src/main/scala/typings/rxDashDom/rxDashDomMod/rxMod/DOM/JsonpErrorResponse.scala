package typings.rxDashDom.rxDashDomMod.rxMod.DOM

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
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonpErrorResponse]
  }
}

