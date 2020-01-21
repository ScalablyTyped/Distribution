package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.AnonIceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOnConnectionStateChange extends js.Object {
  var target: AnonIceConnectionState
}

object EventOnConnectionStateChange {
  @scala.inline
  def apply(target: AnonIceConnectionState): EventOnConnectionStateChange = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventOnConnectionStateChange]
  }
}

