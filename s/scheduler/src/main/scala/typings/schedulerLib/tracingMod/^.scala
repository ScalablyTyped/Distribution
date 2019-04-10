package typings
package schedulerLib.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scheduler/tracing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val __interactionsRef: IfSchedulerTracing[InteractionsRef, scala.Null] = js.native
  val __subscriberRef: IfSchedulerTracing[SubscriberRef, scala.Null] = js.native
  def unstable_clear[T](callback: js.Function0[T]): T = js.native
  def unstable_getCurrent(): stdLib.Set[Interaction] | scala.Null = js.native
  def unstable_getThreadID(): scala.Double = js.native
  def unstable_subscribe(subscriber: Subscriber): scala.Unit = js.native
  def unstable_trace[T](name: java.lang.String, timestamp: scala.Double, callback: js.Function0[T]): T = js.native
  def unstable_trace[T](name: java.lang.String, timestamp: scala.Double, callback: js.Function0[T], threadID: scala.Double): T = js.native
  def unstable_unsubscribe(subscriber: Subscriber): scala.Unit = js.native
  def unstable_wrap[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): IfSchedulerTracing[WrappedFunction[T], T] = js.native
  def unstable_wrap[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, threadID: scala.Double): IfSchedulerTracing[WrappedFunction[T], T] = js.native
}

