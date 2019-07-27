package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOnAddStream extends js.Object {
  var stream: MediaStream
}

object EventOnAddStream {
  @scala.inline
  def apply(stream: MediaStream): EventOnAddStream = {
    val __obj = js.Dynamic.literal(stream = stream)
  
    __obj.asInstanceOf[EventOnAddStream]
  }
}

