package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayloadValue extends js.Object {
  var payload: Double
  var value: Double
}

object AnonPayloadValue {
  @scala.inline
  def apply(payload: Double, value: Double): AnonPayloadValue = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPayloadValue]
  }
}

