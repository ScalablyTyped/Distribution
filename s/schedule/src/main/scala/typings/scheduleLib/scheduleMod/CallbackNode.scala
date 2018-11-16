package typings
package scheduleLib.scheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackNode extends js.Object {
  @JSName("callback")
  var callback_Original: FrameCallbackType = js.native
  var next: CallbackNode | scala.Null = js.native
  var prev: CallbackNode | scala.Null = js.native
  var timesOutAt: scala.Double = js.native
  def callback(deadline: Deadline): scala.Unit = js.native
}

