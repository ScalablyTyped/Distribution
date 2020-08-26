package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduler extends js.Object {
  def isScheduler(value: js.Any): Boolean = js.native
  def now(): Double = js.native
  def schedule(action: js.Function0[Unit]): IDisposable = js.native
  def schedulePeriodic(period: Double, action: js.Function0[Unit]): IDisposable = js.native
  def schedulePeriodicWithState[TState](state: TState, period: Double, action: js.Function1[/* state */ TState, TState]): IDisposable = js.native
  def scheduleRecursive(action: js.Function1[/* action */ js.Function0[Unit], Unit]): IDisposable = js.native
  def scheduleRecursiveWithAbsolute(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
  def scheduleRecursiveWithAbsoluteAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable = js.native
  def scheduleRecursiveWithRelative(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
  def scheduleRecursiveWithRelativeAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable = js.native
  def scheduleRecursiveWithState[TState](
    state: TState,
    action: js.Function2[/* state */ TState, /* action */ js.Function1[/* state */ TState, Unit], Unit]
  ): IDisposable = js.native
  def scheduleWithAbsolute(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
  def scheduleWithAbsoluteAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  def scheduleWithRelative(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
  def scheduleWithRelativeAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  def scheduleWithState[TState](state: TState, action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]): IDisposable = js.native
}

object IScheduler {
  @scala.inline
  def apply(
    isScheduler: js.Any => Boolean,
    now: () => Double,
    schedule: js.Function0[Unit] => IDisposable,
    schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
    schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => IDisposable,
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithAbsoluteAndState: (js.Any, Double, js.Function2[IScheduler, js.Any, IDisposable]) => IDisposable,
    scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithRelativeAndState: (js.Any, Double, js.Function2[IScheduler, js.Any, IDisposable]) => IDisposable,
    scheduleWithState: (js.Any, js.Function2[IScheduler, js.Any, IDisposable]) => IDisposable
  ): IScheduler = {
    val __obj = js.Dynamic.literal(isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState))
    __obj.asInstanceOf[IScheduler]
  }
  @scala.inline
  implicit class ISchedulerOps[Self <: IScheduler] (val x: Self) extends AnyVal {
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
    def setIsScheduler(value: js.Any => Boolean): Self = this.set("isScheduler", js.Any.fromFunction1(value))
    @scala.inline
    def setNow(value: () => Double): Self = this.set("now", js.Any.fromFunction0(value))
    @scala.inline
    def setSchedule(value: js.Function0[Unit] => IDisposable): Self = this.set("schedule", js.Any.fromFunction1(value))
    @scala.inline
    def setSchedulePeriodic(value: (Double, js.Function0[Unit]) => IDisposable): Self = this.set("schedulePeriodic", js.Any.fromFunction2(value))
    @scala.inline
    def setSchedulePeriodicWithState(value: (js.Any, Double, js.Function1[js.Any, js.Any]) => IDisposable): Self = this.set("schedulePeriodicWithState", js.Any.fromFunction3(value))
    @scala.inline
    def setScheduleRecursive(value: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable): Self = this.set("scheduleRecursive", js.Any.fromFunction1(value))
    @scala.inline
    def setScheduleRecursiveWithAbsolute(
      value: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = this.set("scheduleRecursiveWithAbsolute", js.Any.fromFunction2(value))
    @scala.inline
    def setScheduleRecursiveWithAbsoluteAndState(
      value: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = this.set("scheduleRecursiveWithAbsoluteAndState", js.Any.fromFunction3(value))
    @scala.inline
    def setScheduleRecursiveWithRelative(
      value: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = this.set("scheduleRecursiveWithRelative", js.Any.fromFunction2(value))
    @scala.inline
    def setScheduleRecursiveWithRelativeAndState(
      value: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = this.set("scheduleRecursiveWithRelativeAndState", js.Any.fromFunction3(value))
    @scala.inline
    def setScheduleRecursiveWithState(
      value: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => IDisposable
    ): Self = this.set("scheduleRecursiveWithState", js.Any.fromFunction2(value))
    @scala.inline
    def setScheduleWithAbsolute(value: (Double, js.Function0[Unit]) => IDisposable): Self = this.set("scheduleWithAbsolute", js.Any.fromFunction2(value))
    @scala.inline
    def setScheduleWithAbsoluteAndState(value: (js.Any, Double, js.Function2[IScheduler, js.Any, IDisposable]) => IDisposable): Self = this.set("scheduleWithAbsoluteAndState", js.Any.fromFunction3(value))
    @scala.inline
    def setScheduleWithRelative(value: (Double, js.Function0[Unit]) => IDisposable): Self = this.set("scheduleWithRelative", js.Any.fromFunction2(value))
    @scala.inline
    def setScheduleWithRelativeAndState(value: (js.Any, Double, js.Function2[IScheduler, js.Any, IDisposable]) => IDisposable): Self = this.set("scheduleWithRelativeAndState", js.Any.fromFunction3(value))
    @scala.inline
    def setScheduleWithState(value: (js.Any, js.Function2[IScheduler, js.Any, IDisposable]) => IDisposable): Self = this.set("scheduleWithState", js.Any.fromFunction2(value))
  }
  
}

