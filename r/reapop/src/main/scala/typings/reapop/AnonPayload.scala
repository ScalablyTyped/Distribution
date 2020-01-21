package typings.reapop

import typings.reapop.mod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: Notification
  var `type`: String
}

object AnonPayload {
  @scala.inline
  def apply(payload: Notification, `type`: String): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

