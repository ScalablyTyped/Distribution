package typings.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload[Payload] extends js.Object {
  var payload: Payload
}

object AnonPayload {
  @scala.inline
  def apply[Payload](payload: Payload): AnonPayload[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload[Payload]]
  }
}

