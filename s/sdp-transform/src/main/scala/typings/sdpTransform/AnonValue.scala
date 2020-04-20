package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var payload: Double
  var value: Double
}

object AnonValue {
  @scala.inline
  def apply(payload: Double, value: Double): AnonValue = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

