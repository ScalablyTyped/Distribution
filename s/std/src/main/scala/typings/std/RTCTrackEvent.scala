package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTrackEvent extends Event {
  val receiver: RTCRtpReceiver = js.native
  val streams: js.Array[MediaStream] = js.native
  val track: MediaStreamTrack = js.native
  val transceiver: RTCRtpTransceiver = js.native
}

@JSGlobal("RTCTrackEvent")
@js.native
class RTCTrackEventCls protected () extends RTCTrackEvent {
  def this(`type`: java.lang.String, eventInitDict: RTCTrackEventInit) = this()
}

@JSGlobal("RTCTrackEvent")
@js.native
object RTCTrackEvent
  extends Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCTrackEventInit, RTCTrackEvent]

