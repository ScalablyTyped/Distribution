package typings.rxLite.Rx.internals

import typings.rxCore.Rx.IDisposable
import typings.rxLite.Rx.IScheduler
import typings.rxLite.Rx.SingleAssignmentDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledItem[TTime] extends js.Object {
  var disposable: SingleAssignmentDisposable = js.native
  var dueTime: TTime = js.native
  var scheduler: IScheduler = js.native
  var state: TTime = js.native
  def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
  def compareTo(other: ScheduledItem[TTime]): Double = js.native
  def comparer(x: TTime, y: TTime): Double = js.native
  def invoke(): Unit = js.native
  def invokeCore(): IDisposable = js.native
  def isCancelled(): Boolean = js.native
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
  @scala.inline
  implicit class ScheduledItemOps[Self <: ScheduledItem[_], TTime] (val x: Self with ScheduledItem[TTime]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: (IScheduler, js.Any) => IDisposable): Self = this.set("action", js.Any.fromFunction2(value))
    @scala.inline
    def setCompareTo(value: ScheduledItem[TTime] => Double): Self = this.set("compareTo", js.Any.fromFunction1(value))
    @scala.inline
    def setComparer(value: (TTime, TTime) => Double): Self = this.set("comparer", js.Any.fromFunction2(value))
    @scala.inline
    def setDisposable(value: SingleAssignmentDisposable): Self = this.set("disposable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDueTime(value: TTime): Self = this.set("dueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoke(value: () => Unit): Self = this.set("invoke", js.Any.fromFunction0(value))
    @scala.inline
    def setInvokeCore(value: () => IDisposable): Self = this.set("invokeCore", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCancelled(value: () => Boolean): Self = this.set("isCancelled", js.Any.fromFunction0(value))
    @scala.inline
    def setScheduler(value: IScheduler): Self = this.set("scheduler", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TTime): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

