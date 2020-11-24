package typings.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scheduler/tracing", "unstable_wrap")
@js.native
object unstableWrap extends js.Object {
  
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): IfSchedulerTracing[WrappedFunction[T], T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, threadID: Double): IfSchedulerTracing[WrappedFunction[T], T] = js.native
}
