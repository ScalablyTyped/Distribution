package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String
  val `type`: RTCSdpType
  def toJSON(): js.Any
}

@JSGlobal("RTCSessionDescription")
@js.native
object RTCSessionDescription extends Instantiable1[/* descriptionInitDict */ RTCSessionDescriptionInit, RTCSessionDescription]

