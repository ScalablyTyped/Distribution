package typings.schedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackNode extends js.Object {
  
  def callback(deadline: Deadline): Unit = js.native
  @JSName("callback")
  var callback_Original: FrameCallbackType = js.native
  
  var next: CallbackNode | Null = js.native
  
  var prev: CallbackNode | Null = js.native
  
  var timesOutAt: Double = js.native
}
