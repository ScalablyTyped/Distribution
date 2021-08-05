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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPIceCandidate extends StObject {
  
  var address: String
  
  var component: rtp | rtcp | Double
  
  var foundation: String
  
  var ip: String
  
  var port: Double
  
  var priority: Double
  
  var protocol: tcp | udp
  
  var relatedAddress: js.UndefOr[String] = js.undefined
  
  var relatedPort: js.UndefOr[Double] = js.undefined
  
  var tcpType: js.UndefOr[String] = js.undefined
  
  var `type`: host | prflx | srflx | relay
  
  var ufrag: js.UndefOr[String] = js.undefined
  
  var usernameFragment: js.UndefOr[String] = js.undefined
}
object SDPIceCandidate {
  
  inline def apply(
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
  
  extension [Self <: SDPIceCandidate](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: rtp | rtcp | Double): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setFoundation(value: String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: tcp | udp): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setRelatedAddress(value: String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    inline def setRelatedAddressUndefined: Self = StObject.set(x, "relatedAddress", js.undefined)
    
    inline def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    inline def setRelatedPortUndefined: Self = StObject.set(x, "relatedPort", js.undefined)
    
    inline def setTcpType(value: String): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    inline def setTcpTypeUndefined: Self = StObject.set(x, "tcpType", js.undefined)
    
    inline def setType(value: host | prflx | srflx | relay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUfrag(value: String): Self = StObject.set(x, "ufrag", value.asInstanceOf[js.Any])
    
    inline def setUfragUndefined: Self = StObject.set(x, "ufrag", js.undefined)
    
    inline def setUsernameFragment(value: String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    inline def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
