package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foundation extends js.Object {
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

object Foundation {
  @scala.inline
  def apply(
    component: Double,
    foundation: String,
    ip: String,
    port: Double,
    priority: Double | String,
    transport: String,
    `type`: String,
    generation: js.UndefOr[Double] = js.undefined,
    `network-cost`: js.UndefOr[Double] = js.undefined,
    `network-id`: js.UndefOr[Double] = js.undefined,
    raddr: String = null,
    rport: js.UndefOr[Double] = js.undefined,
    tcptype: String = null
  ): Foundation = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(generation)) __obj.updateDynamic("generation")(generation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`network-cost`)) __obj.updateDynamic("network-cost")(`network-cost`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`network-id`)) __obj.updateDynamic("network-id")(`network-id`.get.asInstanceOf[js.Any])
    if (raddr != null) __obj.updateDynamic("raddr")(raddr.asInstanceOf[js.Any])
    if (!js.isUndefined(rport)) __obj.updateDynamic("rport")(rport.get.asInstanceOf[js.Any])
    if (tcptype != null) __obj.updateDynamic("tcptype")(tcptype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foundation]
  }
}

