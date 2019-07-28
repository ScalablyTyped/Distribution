package typings.schedule.scheduleMod

import typings.schedule.Anon_Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schedule", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def unstable_cancelScheduledWork(callbackNode: CallbackNode): Unit = js.native
  def unstable_now(): Double = js.native
  def unstable_scheduleWork(callback: FrameCallbackType): CallbackNode = js.native
  def unstable_scheduleWork(callback: FrameCallbackType, options: Anon_Timeout): CallbackNode = js.native
}

