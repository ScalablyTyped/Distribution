package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOnAddStream extends js.Object {
  var stream: MediaStream
}

object EventOnAddStream {
  @scala.inline
  def apply(stream: MediaStream): EventOnAddStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnAddStream]
  }
}

