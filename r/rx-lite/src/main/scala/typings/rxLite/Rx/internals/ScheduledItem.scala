package typings.rxLite.Rx.internals

import typings.rxCore.Rx.IDisposable
import typings.rxLite.Rx.IScheduler
import typings.rxLite.Rx.SingleAssignmentDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledItem[TTime] extends js.Object {
  var disposable: SingleAssignmentDisposable
  var dueTime: TTime
  var scheduler: IScheduler
  var state: TTime
  def action(scheduler: IScheduler, state: js.Any): IDisposable
  def compareTo(other: ScheduledItem[TTime]): Double
  def comparer(x: TTime, y: TTime): Double
  def invoke(): Unit
  def invokeCore(): IDisposable
  def isCancelled(): Boolean
}

object ScheduledItem {
  @scala.inline
  def apply[TTime](
    action: (IScheduler, js.Any) => IDisposable,
    compareTo: ScheduledItem[TTime] => Double,
    comparer: (TTime, TTime) => Double,
    disposable: SingleAssignmentDisposable,
    dueTime: TTime,
    invoke: () => Unit,
    invokeCore: () => IDisposable,
    isCancelled: () => Boolean,
    scheduler: IScheduler,
    state: TTime
  ): ScheduledItem[TTime] = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), compareTo = js.Any.fromFunction1(compareTo), comparer = js.Any.fromFunction2(comparer), disposable = disposable.asInstanceOf[js.Any], dueTime = dueTime.asInstanceOf[js.Any], invoke = js.Any.fromFunction0(invoke), invokeCore = js.Any.fromFunction0(invokeCore), isCancelled = js.Any.fromFunction0(isCancelled), scheduler = scheduler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledItem[TTime]]
  }
}

