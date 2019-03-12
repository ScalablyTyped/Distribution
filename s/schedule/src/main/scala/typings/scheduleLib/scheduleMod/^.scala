package typings
package scheduleLib.scheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schedule", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def unstable_cancelScheduledWork(callbackNode: CallbackNode): scala.Unit = js.native
  def unstable_now(): scala.Double = js.native
  def unstable_scheduleWork(callback: FrameCallbackType): CallbackNode = js.native
  def unstable_scheduleWork(callback: FrameCallbackType, options: scheduleLib.Anon_Timeout): CallbackNode = js.native
}

