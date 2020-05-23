package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var payload: Double
  var value: Double
}

object Value {
  @scala.inline
  def apply(payload: Double, value: Double): Value = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

