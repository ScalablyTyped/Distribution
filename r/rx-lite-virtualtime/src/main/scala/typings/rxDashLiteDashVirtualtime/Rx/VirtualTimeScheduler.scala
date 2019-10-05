package typings.rxDashLiteDashVirtualtime.Rx

import typings.rxDashCore.Rx.IDisposable
import typings.rxDashLite.Rx.IScheduler
import typings.rxDashLite.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualTimeScheduler[TAbsolute, TRelative] extends IScheduler {
  var isEnabled: Boolean
  /* protected abstract */ def add(from: TAbsolute, by: TRelative): TAbsolute
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  def advanceBy(time: TRelative): Unit
  def advanceTo(time: TAbsolute): Unit
  /* protected */ def getNext(): ScheduledItem[TAbsolute]
  def scheduleAbsolute(dueTime: TAbsolute, action: js.Function0[Unit]): IDisposable
  def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: TAbsolute,
    action: js.Function2[/* scheduler */ typings.rxDashCore.Rx.IScheduler, /* state */ TState, IDisposable]
  ): IDisposable
  def scheduleRelative(dueTime: TRelative, action: js.Function0[Unit]): IDisposable
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[/* scheduler */ typings.rxDashCore.Rx.IScheduler, /* state */ TState, IDisposable]
  ): IDisposable
  def sleep(time: TRelative): Unit
  def start(): IDisposable
  def stop(): Unit
  /* protected abstract */ def toDateTimeOffset(duetime: TAbsolute): Double
  /* protected abstract */ def toRelative(duetime: Double): TRelative
}

object VirtualTimeScheduler {
  @scala.inline
  def apply[TAbsolute, TRelative](
    add: (TAbsolute, TRelative) => TAbsolute,
    advanceBy: TRelative => Unit,
    advanceTo: TAbsolute => Unit,
    getNext: () => ScheduledItem[TAbsolute],
    isEnabled: Boolean,
    isScheduler: js.Any => Boolean,
    now: () => Double,
    schedule: js.Function0[Unit] => IDisposable,
    scheduleAbsolute: (TAbsolute, js.Function0[Unit]) => IDisposable,
    scheduleAbsoluteWithState: (js.Any, TAbsolute, js.Function2[/* scheduler */ typings.rxDashCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable,
    schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
    schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => IDisposable,
    scheduleRelative: (TRelative, js.Function0[Unit]) => IDisposable,
    scheduleRelativeWithState: (js.Any, TRelative, js.Function2[/* scheduler */ typings.rxDashCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable,
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithAbsoluteAndState: (js.Any, Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => IDisposable,
    scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithRelativeAndState: (js.Any, Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => IDisposable,
    scheduleWithState: (js.Any, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, IDisposable]) => IDisposable,
    sleep: TRelative => Unit,
    start: () => IDisposable,
    stop: () => Unit,
    toDateTimeOffset: TAbsolute => Double,
    toRelative: Double => TRelative
  ): VirtualTimeScheduler[TAbsolute, TRelative] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled, isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
  
    __obj.asInstanceOf[VirtualTimeScheduler[TAbsolute, TRelative]]
  }
}

