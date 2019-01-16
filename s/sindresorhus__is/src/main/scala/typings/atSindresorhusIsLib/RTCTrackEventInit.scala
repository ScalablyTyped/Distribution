package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCTrackEventInit extends EventInit {
  var receiver: RTCRtpReceiver
  var streams: js.UndefOr[Array[MediaStream]] = js.undefined
  var track: MediaStreamTrack
  var transceiver: RTCRtpTransceiver
}

