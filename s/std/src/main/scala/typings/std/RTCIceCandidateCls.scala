package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCIceCandidate")
@js.native
class RTCIceCandidateCls () extends RTCIceCandidate {
  def this(candidateInitDict: RTCIceCandidateInit) = this()
  /* CompleteClass */
  override val candidate: java.lang.String = js.native
  /* CompleteClass */
  override val component: RTCIceComponent | Null = js.native
  /* CompleteClass */
  override val foundation: java.lang.String | Null = js.native
  /* CompleteClass */
  override val ip: java.lang.String | Null = js.native
  /* CompleteClass */
  override val port: Double | Null = js.native
  /* CompleteClass */
  override val priority: Double | Null = js.native
  /* CompleteClass */
  override val protocol: RTCIceProtocol | Null = js.native
  /* CompleteClass */
  override val relatedAddress: java.lang.String | Null = js.native
  /* CompleteClass */
  override val relatedPort: Double | Null = js.native
  /* CompleteClass */
  override val sdpMLineIndex: Double | Null = js.native
  /* CompleteClass */
  override val sdpMid: java.lang.String | Null = js.native
  /* CompleteClass */
  override val tcpType: RTCIceTcpCandidateType | Null = js.native
  /* CompleteClass */
  override val `type`: RTCIceCandidateType | Null = js.native
  /* CompleteClass */
  override val usernameFragment: java.lang.String | Null = js.native
  /* CompleteClass */
  override def toJSON(): RTCIceCandidateInit = js.native
}

