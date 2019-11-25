package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payloads extends js.Object {
  var payloads: js.UndefOr[String] = js.undefined
  var port: Double
  var protocol: String
  var `type`: String
}

object Anon_Payloads {
  @scala.inline
  def apply(port: Double, protocol: String, `type`: String, payloads: String = null): Anon_Payloads = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payloads != null) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Payloads]
  }
}

