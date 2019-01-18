package typings
package schedulerLib.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scheduler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val unstable_IdlePriority: /* 5 */ scala.Double = js.native
  val unstable_ImmediatePriority: /* 1 */ scala.Double = js.native
  val unstable_LowPriority: /* 4 */ scala.Double = js.native
  val unstable_NormalPriority: /* 3 */ scala.Double = js.native
  val unstable_UserBlockingPriority: /* 2 */ scala.Double = js.native
  def unstable_cancelCallback(callbackNode: schedulerLib.schedulerMod.CallbackNode): scala.Unit = js.native
  def unstable_continueExecution(): scala.Unit = js.native
  def unstable_getCurrentPriorityLevel(): scala.Double = js.native
  def unstable_getFirstCallbackNode(): schedulerLib.schedulerMod.CallbackNode | scala.Null = js.native
  def unstable_now(): scala.Double = js.native
  def unstable_pauseExecution(): scala.Unit = js.native
  def unstable_runWithPriority[T](priorityLevel: scala.Double, eventHandler: js.Function0[T]): js.UndefOr[T] = js.native
  def unstable_scheduleCallback(callback: schedulerLib.schedulerMod.FrameCallbackType): schedulerLib.schedulerMod.CallbackNode = js.native
  def unstable_scheduleCallback(
    callback: schedulerLib.schedulerMod.FrameCallbackType,
    deprecated_options: schedulerLib.Anon_Timeout
  ): schedulerLib.schedulerMod.CallbackNode = js.native
  def unstable_shouldYield(): scala.Boolean = js.native
  def unstable_wrapCallback(callback: schedulerLib.schedulerMod.FrameCallbackType): js.Function0[js.UndefOr[schedulerLib.schedulerMod.FrameCallbackType]] = js.native
}

