package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: Double
  var subtype: js.UndefOr[String] = js.undefined
  var `type`: String
}

object AnonPayload {
  @scala.inline
  def apply(payload: Double, `type`: String, subtype: String = null): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

