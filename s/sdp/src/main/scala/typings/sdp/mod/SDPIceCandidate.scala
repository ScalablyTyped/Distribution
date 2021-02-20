package typings.sdp.mod

import typings.sdp.sdpStrings.host
import typings.sdp.sdpStrings.prflx
import typings.sdp.sdpStrings.relay
import typings.sdp.sdpStrings.rtcp
import typings.sdp.sdpStrings.rtp
import typings.sdp.sdpStrings.srflx
import typings.sdp.sdpStrings.tcp
import typings.sdp.sdpStrings.udp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPIceCandidate extends StObject {
  
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
  implicit class SDPIceCandidateMutableBuilder[Self <: SDPIceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: rtp | rtcp | Double): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundation(value: String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: tcp | udp): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddress(value: String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddressUndefined: Self = StObject.set(x, "relatedAddress", js.undefined)
    
    @scala.inline
    def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPortUndefined: Self = StObject.set(x, "relatedPort", js.undefined)
    
    @scala.inline
    def setTcpType(value: String): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpTypeUndefined: Self = StObject.set(x, "tcpType", js.undefined)
    
    @scala.inline
    def setType(value: host | prflx | srflx | relay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUfrag(value: String): Self = StObject.set(x, "ufrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUfragUndefined: Self = StObject.set(x, "ufrag", js.undefined)
    
    @scala.inline
    def setUsernameFragment(value: String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
