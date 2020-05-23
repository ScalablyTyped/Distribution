package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.anon.IceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOnConnectionStateChange extends js.Object {
  var target: IceConnectionState
}

object EventOnConnectionStateChange {
  @scala.inline
  def apply(target: IceConnectionState): EventOnConnectionStateChange = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnConnectionStateChange]
  }
}

