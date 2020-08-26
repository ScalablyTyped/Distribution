package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Foundation extends js.Object {
  var component: Double = js.native
  var foundation: String = js.native
  var generation: js.UndefOr[Double] = js.native
  var ip: String = js.native
  var `network-cost`: js.UndefOr[Double] = js.native
  var `network-id`: js.UndefOr[Double] = js.native
  var port: Double = js.native
  var priority: Double | String = js.native
  var raddr: js.UndefOr[String] = js.native
  var rport: js.UndefOr[Double] = js.native
  var tcptype: js.UndefOr[String] = js.native
  var transport: String = js.native
  var `type`: String = js.native
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
    `type`: String
  ): Foundation = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foundation]
  }
  @scala.inline
  implicit class FoundationOps[Self <: Foundation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponent(value: Double): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoundation(value: String): Self = this.set("foundation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double | String): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def `setNetwork-cost`(value: Double): Self = this.set("network-cost", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNetwork-cost`: Self = this.set("network-cost", js.undefined)
    @scala.inline
    def `setNetwork-id`(value: Double): Self = this.set("network-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNetwork-id`: Self = this.set("network-id", js.undefined)
    @scala.inline
    def setRaddr(value: String): Self = this.set("raddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaddr: Self = this.set("raddr", js.undefined)
    @scala.inline
    def setRport(value: Double): Self = this.set("rport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRport: Self = this.set("rport", js.undefined)
    @scala.inline
    def setTcptype(value: String): Self = this.set("tcptype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcptype: Self = this.set("tcptype", js.undefined)
  }
  
}

