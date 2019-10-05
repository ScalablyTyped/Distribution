package typings.schedule.scheduleMod

import typings.schedule.Anon_Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schedule", "unstable_scheduleWork")
@js.native
object unstable_scheduleWork extends js.Object {
  def apply(callback: FrameCallbackType): CallbackNode = js.native
  def apply(callback: FrameCallbackType, options: Anon_Timeout): CallbackNode = js.native
}

