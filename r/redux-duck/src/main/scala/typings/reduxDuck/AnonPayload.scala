package typings.reduxDuck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: js.Any
}

object AnonPayload {
  @scala.inline
  def apply(payload: js.Any): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPayload]
  }
}

