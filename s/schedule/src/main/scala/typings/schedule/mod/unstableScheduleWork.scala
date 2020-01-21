package typings.schedule.mod

import typings.schedule.AnonTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schedule", "unstable_scheduleWork")
@js.native
object unstableScheduleWork extends js.Object {
  def apply(callback: FrameCallbackType): CallbackNode = js.native
  def apply(callback: FrameCallbackType, options: AnonTimeout): CallbackNode = js.native
}

