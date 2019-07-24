package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentFoundation extends js.Object {
  var component: scala.Double
  var foundation: java.lang.String
  var generation: js.UndefOr[scala.Double] = js.undefined
  var ip: java.lang.String
  var `network-cost`: js.UndefOr[scala.Double] = js.undefined
  var `network-id`: js.UndefOr[scala.Double] = js.undefined
  var port: scala.Double
  var priority: scala.Double | java.lang.String
  var raddr: js.UndefOr[java.lang.String] = js.undefined
  var rport: js.UndefOr[scala.Double] = js.undefined
  var tcptype: js.UndefOr[java.lang.String] = js.undefined
  var transport: java.lang.String
  var `type`: java.lang.String
}

object Anon_ComponentFoundation {
  @scala.inline
  def apply(
    component: scala.Double,
    foundation: java.lang.String,
    ip: java.lang.String,
    port: scala.Double,
    priority: scala.Double | java.lang.String,
    transport: java.lang.String,
    `type`: java.lang.String,
    generation: scala.Int | scala.Double = null,
    `network-cost`: scala.Int | scala.Double = null,
    `network-id`: scala.Int | scala.Double = null,
    raddr: java.lang.String = null,
    rport: scala.Int | scala.Double = null,
    tcptype: java.lang.String = null
  ): Anon_ComponentFoundation = {
    val __obj = js.Dynamic.literal(component = component, foundation = foundation, ip = ip, port = port, priority = priority.asInstanceOf[js.Any], transport = transport)
    __obj.updateDynamic("type")(`type`)
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (`network-cost` != null) __obj.updateDynamic("network-cost")(`network-cost`.asInstanceOf[js.Any])
    if (`network-id` != null) __obj.updateDynamic("network-id")(`network-id`.asInstanceOf[js.Any])
    if (raddr != null) __obj.updateDynamic("raddr")(raddr)
    if (rport != null) __obj.updateDynamic("rport")(rport.asInstanceOf[js.Any])
    if (tcptype != null) __obj.updateDynamic("tcptype")(tcptype)
    __obj.asInstanceOf[Anon_ComponentFoundation]
  }
}

