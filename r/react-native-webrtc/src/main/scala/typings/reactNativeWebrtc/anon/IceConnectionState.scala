package typings.reactNativeWebrtc.anon

import typings.reactNativeWebrtc.mod.RTCIceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IceConnectionState extends js.Object {
  var iceConnectionState: RTCIceConnectionState
}

object IceConnectionState {
  @scala.inline
  def apply(iceConnectionState: RTCIceConnectionState): IceConnectionState = {
    val __obj = js.Dynamic.literal(iceConnectionState = iceConnectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceConnectionState]
  }
}

