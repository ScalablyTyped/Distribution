package typings.scheduler.tracingMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scheduler/tracing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val __interactionsRef: IfSchedulerTracing[InteractionsRef, Null] = js.native
  val __subscriberRef: IfSchedulerTracing[SubscriberRef, Null] = js.native
  def unstable_clear[T](callback: js.Function0[T]): T = js.native
  def unstable_getCurrent(): Set[Interaction] | Null = js.native
  def unstable_getThreadID(): Double = js.native
  def unstable_subscribe(subscriber: Subscriber): Unit = js.native
  def unstable_trace[T](name: String, timestamp: Double, callback: js.Function0[T]): T = js.native
  def unstable_trace[T](name: String, timestamp: Double, callback: js.Function0[T], threadID: Double): T = js.native
  def unstable_unsubscribe(subscriber: Subscriber): Unit = js.native
  def unstable_wrap[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): IfSchedulerTracing[WrappedFunction[T], T] = js.native
  def unstable_wrap[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, threadID: Double): IfSchedulerTracing[WrappedFunction[T], T] = js.native
}

