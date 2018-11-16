package typings
package schedulerLib.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackNode extends js.Object {
  @JSName("callback")
  var callback_Original: FrameCallbackType = js.native
  var expirationTime: scala.Double = js.native
  var next: CallbackNode | scala.Null = js.native
  var prev: CallbackNode | scala.Null = js.native
  var priorityLevel: scala.Double = js.native
  def callback(deadline: Deadline): FrameCallbackType | scala.Unit = js.native
}

