package typings.reactNativeWebrtc

import typings.reactNativeWebrtc.mod.RTCIceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIceConnectionState extends js.Object {
  var iceConnectionState: RTCIceConnectionState
}

object AnonIceConnectionState {
  @scala.inline
  def apply(iceConnectionState: RTCIceConnectionState): AnonIceConnectionState = {
    val __obj = js.Dynamic.literal(iceConnectionState = iceConnectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIceConnectionState]
  }
}

