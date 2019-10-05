package typings.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scheduler/tracing", "unstable_wrap")
@js.native
object unstable_wrap extends js.Object {
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): IfSchedulerTracing[WrappedFunction[T], T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, threadID: Double): IfSchedulerTracing[WrappedFunction[T], T] = js.native
}

