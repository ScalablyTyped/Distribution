package typings.std

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

