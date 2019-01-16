package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTrackEvent extends Event {
  val receiver: RTCRtpReceiver = js.native
  val streams: ReadonlyArray[MediaStream] = js.native
  val track: MediaStreamTrack = js.native
  val transceiver: RTCRtpTransceiver = js.native
}

@JSGlobal("RTCTrackEvent")
@js.native
object RTCTrackEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCTrackEventInit, RTCTrackEvent]

