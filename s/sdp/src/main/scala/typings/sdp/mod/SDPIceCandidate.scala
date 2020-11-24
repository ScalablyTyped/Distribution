package typings.sdp.mod

import typings.sdp.sdpStrings.host
import typings.sdp.sdpStrings.prflx
import typings.sdp.sdpStrings.relay
import typings.sdp.sdpStrings.rtcp
import typings.sdp.sdpStrings.rtp
import typings.sdp.sdpStrings.srflx
import typings.sdp.sdpStrings.tcp
import typings.sdp.sdpStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPIceCandidate extends js.Object {
  
  var address: String = js.native
  
  var component: rtp | rtcp | Double = js.native
  
  var foundation: String = js.native
  
  var ip: String = js.native
  
  var port: Double = js.native
  
  var priority: Double = js.native
  
  var protocol: tcp | udp = js.native
  
  var relatedAddress: js.UndefOr[String] = js.native
  
  var relatedPort: js.UndefOr[Double] = js.native
  
  var tcpType: js.UndefOr[String] = js.native
  
  var `type`: host | prflx | srflx | relay = js.native
  
  var ufrag: js.UndefOr[String] = js.native
  
  var usernameFragment: js.UndefOr[String] = js.native
}
object SDPIceCandidate {
  
  @scala.inline
  def apply(
    address: String,
    component: rtp | rtcp | Double,
    foundation: String,
    ip: String,
    port: Double,
    priority: Double,
    protocol: tcp | udp,
    `type`: host | prflx | srflx | relay
  ): SDPIceCandidate = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPIceCandidate]
  }
  
  @scala.inline
  implicit class SDPIceCandidateOps[Self <: SDPIceCandidate] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: rtp | rtcp | Double): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundation(value: String): Self = this.set("foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: tcp | udp): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: host | prflx | srflx | relay): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddress(value: String): Self = this.set("relatedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedAddress: Self = this.set("relatedAddress", js.undefined)
    
    @scala.inline
    def setRelatedPort(value: Double): Self = this.set("relatedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedPort: Self = this.set("relatedPort", js.undefined)
    
    @scala.inline
    def setTcpType(value: String): Self = this.set("tcpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpType: Self = this.set("tcpType", js.undefined)
    
    @scala.inline
    def setUfrag(value: String): Self = this.set("ufrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUfrag: Self = this.set("ufrag", js.undefined)
    
    @scala.inline
    def setUsernameFragment(value: String): Self = this.set("usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameFragment: Self = this.set("usernameFragment", js.undefined)
  }
}
