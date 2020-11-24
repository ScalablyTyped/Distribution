package typings.schedule.mod

import typings.schedule.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("schedule", "unstable_scheduleWork")
@js.native
object unstableScheduleWork extends js.Object {
  
  def apply(callback: FrameCallbackType): CallbackNode = js.native
  def apply(callback: FrameCallbackType, options: Timeout): CallbackNode = js.native
}
