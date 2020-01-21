package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayloads extends js.Object {
  var payloads: js.UndefOr[String] = js.undefined
  var port: Double
  var protocol: String
  var `type`: String
}

object AnonPayloads {
  @scala.inline
  def apply(port: Double, protocol: String, `type`: String, payloads: String = null): AnonPayloads = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payloads != null) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayloads]
  }
}

