package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigPayload extends js.Object {
  var config: String
  var payload: Double
}

object AnonConfigPayload {
  @scala.inline
  def apply(config: String, payload: Double): AnonConfigPayload = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfigPayload]
  }
}

