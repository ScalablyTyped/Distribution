package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
trait RTCIceCandidate extends js.Object {
  val candidate: java.lang.String
  val component: RTCIceComponent | Null
  val foundation: java.lang.String | Null
  val port: Double | Null
  val priority: Double | Null
  val protocol: RTCIceProtocol | Null
  val relatedAddress: java.lang.String | Null
  val relatedPort: Double | Null
  val sdpMLineIndex: Double | Null
  val sdpMid: java.lang.String | Null
  val tcpType: RTCIceTcpCandidateType | Null
  val `type`: RTCIceCandidateType | Null
  val usernameFragment: java.lang.String | Null
  def toJSON(): RTCIceCandidateInit
}

object RTCIceCandidate {
  @scala.inline
  def apply(
    candidate: java.lang.String,
    toJSON: () => RTCIceCandidateInit,
    component: RTCIceComponent = null,
    foundation: java.lang.String = null,
    port: Double = null.asInstanceOf[Double],
    priority: Double = null.asInstanceOf[Double],
    protocol: RTCIceProtocol = null,
    relatedAddress: java.lang.String = null,
    relatedPort: Double = null.asInstanceOf[Double],
    sdpMLineIndex: Double = null.asInstanceOf[Double],
    sdpMid: java.lang.String = null,
    tcpType: RTCIceTcpCandidateType = null,
    `type`: RTCIceCandidateType = null,
    usernameFragment: java.lang.String = null
  ): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], relatedAddress = relatedAddress.asInstanceOf[js.Any], relatedPort = relatedPort.asInstanceOf[js.Any], sdpMLineIndex = sdpMLineIndex.asInstanceOf[js.Any], sdpMid = sdpMid.asInstanceOf[js.Any], tcpType = tcpType.asInstanceOf[js.Any], usernameFragment = usernameFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidate]
  }
}

