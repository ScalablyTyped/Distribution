package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentFoundation extends js.Object {
  var component: scala.Double
  var foundation: java.lang.String
  var generation: scala.Double
  var ip: java.lang.String
  var `network-cost`: js.UndefOr[scala.Double] = js.undefined
  var `network-id`: js.UndefOr[scala.Double] = js.undefined
  var port: scala.Double
  var priority: scala.Double | java.lang.String
  var raddr: java.lang.String
  var rport: scala.Double
  var tcptype: java.lang.String
  var transport: java.lang.String
  var `type`: java.lang.String
}

object Anon_ComponentFoundation {
  @scala.inline
  def apply(
    component: scala.Double,
    foundation: java.lang.String,
    generation: scala.Double,
    ip: java.lang.String,
    port: scala.Double,
    priority: scala.Double | java.lang.String,
    raddr: java.lang.String,
    rport: scala.Double,
    tcptype: java.lang.String,
    transport: java.lang.String,
    `type`: java.lang.String,
    `network-cost`: scala.Int | scala.Double = null,
    `network-id`: scala.Int | scala.Double = null
  ): Anon_ComponentFoundation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("foundation")(foundation)
    __obj.updateDynamic("generation")(generation)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.updateDynamic("raddr")(raddr)
    __obj.updateDynamic("rport")(rport)
    __obj.updateDynamic("tcptype")(tcptype)
    __obj.updateDynamic("transport")(transport)
    if (`network-cost` != null) __obj.updateDynamic("network-cost")(`network-cost`.asInstanceOf[js.Any])
    if (`network-id` != null) __obj.updateDynamic("network-id")(`network-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComponentFoundation]
  }
}

