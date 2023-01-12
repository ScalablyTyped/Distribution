package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
trait RTCIceCandidate extends StObject {
  
  /* standard dom */
  val address: java.lang.String | Null
  
  /* standard dom */
  val candidate: java.lang.String
  
  /* standard dom */
  val component: RTCIceComponent | Null
  
  /* standard dom */
  val foundation: java.lang.String | Null
  
  /* standard dom */
  val port: Double | Null
  
  /* standard dom */
  val priority: Double | Null
  
  /* standard dom */
  val protocol: RTCIceProtocol | Null
  
  /* standard dom */
  val relatedAddress: java.lang.String | Null
  
  /* standard dom */
  val relatedPort: Double | Null
  
  /* standard dom */
  val sdpMLineIndex: Double | Null
  
  /* standard dom */
  val sdpMid: java.lang.String | Null
  
  /* standard dom */
  val tcpType: RTCIceTcpCandidateType | Null
  
  /* standard dom */
  def toJSON(): RTCIceCandidateInit
  
  /* standard dom */
  val `type`: RTCIceCandidateType | Null
  
  /* standard dom */
  val usernameFragment: java.lang.String | Null
}
object RTCIceCandidate {
  
  inline def apply(candidate: java.lang.String, toJSON: () => RTCIceCandidateInit): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), address = null, component = null, foundation = null, port = null, priority = null, protocol = null, relatedAddress = null, relatedPort = null, sdpMLineIndex = null, sdpMid = null, tcpType = null, usernameFragment = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[RTCIceCandidate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setCandidate(value: java.lang.String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: RTCIceComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setFoundation(value: java.lang.String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    inline def setFoundationNull: Self = StObject.set(x, "foundation", null)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setProtocol(value: RTCIceProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setRelatedAddress(value: java.lang.String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    inline def setRelatedAddressNull: Self = StObject.set(x, "relatedAddress", null)
    
    inline def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    inline def setRelatedPortNull: Self = StObject.set(x, "relatedPort", null)
    
    inline def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    inline def setSdpMLineIndexNull: Self = StObject.set(x, "sdpMLineIndex", null)
    
    inline def setSdpMid(value: java.lang.String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
    
    inline def setSdpMidNull: Self = StObject.set(x, "sdpMid", null)
    
    inline def setTcpType(value: RTCIceTcpCandidateType): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    inline def setTcpTypeNull: Self = StObject.set(x, "tcpType", null)
    
    inline def setToJSON(value: () => RTCIceCandidateInit): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: RTCIceCandidateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    inline def setUsernameFragmentNull: Self = StObject.set(x, "usernameFragment", null)
  }
}
