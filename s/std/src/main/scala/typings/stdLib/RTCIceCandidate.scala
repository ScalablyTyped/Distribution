package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
trait RTCIceCandidate extends js.Object {
  val candidate: java.lang.String
  val component: RTCIceComponent | scala.Null
  val foundation: java.lang.String | scala.Null
  val ip: java.lang.String | scala.Null
  val port: scala.Double | scala.Null
  val priority: scala.Double | scala.Null
  val protocol: RTCIceProtocol | scala.Null
  val relatedAddress: java.lang.String | scala.Null
  val relatedPort: scala.Double | scala.Null
  val sdpMLineIndex: scala.Double | scala.Null
  val sdpMid: java.lang.String | scala.Null
  val tcpType: RTCIceTcpCandidateType | scala.Null
  val `type`: RTCIceCandidateType | scala.Null
  val usernameFragment: java.lang.String | scala.Null
  def toJSON(): RTCIceCandidateInit
}

@JSGlobal("RTCIceCandidate")
@js.native
class RTCIceCandidateCls () extends RTCIceCandidate {
  def this(candidateInitDict: RTCIceCandidateInit) = this()
  /* CompleteClass */
  override val candidate: java.lang.String = js.native
  /* CompleteClass */
  override val component: RTCIceComponent | scala.Null = js.native
  /* CompleteClass */
  override val foundation: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val ip: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val port: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override val priority: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override val protocol: RTCIceProtocol | scala.Null = js.native
  /* CompleteClass */
  override val relatedAddress: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val relatedPort: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override val sdpMLineIndex: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override val sdpMid: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val tcpType: RTCIceTcpCandidateType | scala.Null = js.native
  /* CompleteClass */
  override val `type`: RTCIceCandidateType | scala.Null = js.native
  /* CompleteClass */
  override val usernameFragment: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def toJSON(): RTCIceCandidateInit = js.native
}

@JSGlobal("RTCIceCandidate")
@js.native
object RTCIceCandidate
  extends org.scalablytyped.runtime.Instantiable0[RTCIceCandidate]
     with org.scalablytyped.runtime.Instantiable1[/* candidateInitDict */ RTCIceCandidateInit, RTCIceCandidate]

