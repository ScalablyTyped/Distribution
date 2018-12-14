package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


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
object RTCIceCandidate
  extends org.scalablytyped.runtime.Instantiable0[RTCIceCandidate]
     with org.scalablytyped.runtime.Instantiable1[/* candidateInitDict */ RTCIceCandidateInit, RTCIceCandidate]

