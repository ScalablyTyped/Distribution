package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payloads extends js.Object {
  var payloads: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var protocol: java.lang.String
  var `type`: java.lang.String
}

object Anon_Payloads {
  @scala.inline
  def apply(
    port: scala.Double,
    protocol: java.lang.String,
    `type`: java.lang.String,
    payloads: java.lang.String = null
  ): Anon_Payloads = {
    val __obj = js.Dynamic.literal(port = port, protocol = protocol)
    __obj.updateDynamic("type")(`type`)
    if (payloads != null) __obj.updateDynamic("payloads")(payloads)
    __obj.asInstanceOf[Anon_Payloads]
  }
}

