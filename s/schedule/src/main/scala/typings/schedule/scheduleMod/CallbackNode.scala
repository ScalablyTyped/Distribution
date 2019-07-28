package typings.schedule.scheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackNode extends js.Object {
  @JSName("callback")
  var callback_Original: FrameCallbackType = js.native
  var next: CallbackNode | Null = js.native
  var prev: CallbackNode | Null = js.native
  var timesOutAt: Double = js.native
  def callback(deadline: Deadline): Unit = js.native
}

