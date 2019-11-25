package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.RTCIceCandidateDictionary
  - typings.std.RTCIceCandidateComplete
*/
trait RTCIceGatherCandidate extends js.Object

object RTCIceGatherCandidate {
  @scala.inline
  def RTCIceCandidateDictionary(
    foundation: java.lang.String = null,
    ip: java.lang.String = null,
    msMTurnSessionId: java.lang.String = null,
    port: Int | Double = null,
    priority: Int | Double = null,
    protocol: RTCIceProtocol = null,
    relatedAddress: java.lang.String = null,
    relatedPort: Int | Double = null,
    tcpType: RTCIceTcpCandidateType = null,
    `type`: RTCIceCandidateType = null
  ): RTCIceGatherCandidate = {
    val __obj = js.Dynamic.literal()
    if (foundation != null) __obj.updateDynamic("foundation")(foundation.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (msMTurnSessionId != null) __obj.updateDynamic("msMTurnSessionId")(msMTurnSessionId.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (relatedAddress != null) __obj.updateDynamic("relatedAddress")(relatedAddress.asInstanceOf[js.Any])
    if (relatedPort != null) __obj.updateDynamic("relatedPort")(relatedPort.asInstanceOf[js.Any])
    if (tcpType != null) __obj.updateDynamic("tcpType")(tcpType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGatherCandidate]
  }
}

