package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentFoundation extends js.Object {
  var component: Double
  var foundation: String
  var generation: js.UndefOr[Double] = js.undefined
  var ip: String
  var `network-cost`: js.UndefOr[Double] = js.undefined
  var `network-id`: js.UndefOr[Double] = js.undefined
  var port: Double
  var priority: Double | String
  var raddr: js.UndefOr[String] = js.undefined
  var rport: js.UndefOr[Double] = js.undefined
  var tcptype: js.UndefOr[String] = js.undefined
  var transport: String
  var `type`: String
}

object Anon_ComponentFoundation {
  @scala.inline
  def apply(
    component: Double,
    foundation: String,
    ip: String,
    port: Double,
    priority: Double | String,
    transport: String,
    `type`: String,
    generation: Int | Double = null,
    `network-cost`: Int | Double = null,
    `network-id`: Int | Double = null,
    raddr: String = null,
    rport: Int | Double = null,
    tcptype: String = null
  ): Anon_ComponentFoundation = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (`network-cost` != null) __obj.updateDynamic("network-cost")(`network-cost`.asInstanceOf[js.Any])
    if (`network-id` != null) __obj.updateDynamic("network-id")(`network-id`.asInstanceOf[js.Any])
    if (raddr != null) __obj.updateDynamic("raddr")(raddr.asInstanceOf[js.Any])
    if (rport != null) __obj.updateDynamic("rport")(rport.asInstanceOf[js.Any])
    if (tcptype != null) __obj.updateDynamic("tcptype")(tcptype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComponentFoundation]
  }
}

