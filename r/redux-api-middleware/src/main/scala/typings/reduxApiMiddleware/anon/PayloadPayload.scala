package typings.reduxApiMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadPayload[Payload] extends js.Object {
  var payload: Payload
}

object PayloadPayload {
  @scala.inline
  def apply[Payload](payload: Payload): PayloadPayload[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadPayload[Payload]]
  }
}

