package typings.reduxDuck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayloadAny extends js.Object {
  var payload: js.Any
}

object AnonPayloadAny {
  @scala.inline
  def apply(payload: js.Any): AnonPayloadAny = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPayloadAny]
  }
}

