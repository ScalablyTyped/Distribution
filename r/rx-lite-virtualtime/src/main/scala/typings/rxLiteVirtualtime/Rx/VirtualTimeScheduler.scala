package typings.rxLiteVirtualtime.Rx

import typings.rxCore.Rx.IDisposable
import typings.rxLite.Rx.IScheduler
import typings.rxLite.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualTimeScheduler[TAbsolute, TRelative] extends IScheduler {
  
  /* protected abstract */ def add(from: TAbsolute, by: TRelative): TAbsolute = js.native
  
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  def advanceBy(time: TRelative): Unit = js.native
  
  def advanceTo(time: TAbsolute): Unit = js.native
  
  /* protected */ def getNext(): ScheduledItem[TAbsolute] = js.native
  
  var isEnabled: Boolean = js.native
  
  def scheduleAbsolute(dueTime: TAbsolute, action: js.Function0[Unit]): IDisposable = js.native
  
  def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: TAbsolute,
    action: js.Function2[/* scheduler */ typings.rxCore.Rx.IScheduler, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  
  def scheduleRelative(dueTime: TRelative, action: js.Function0[Unit]): IDisposable = js.native
  
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[/* scheduler */ typings.rxCore.Rx.IScheduler, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  
  def sleep(time: TRelative): Unit = js.native
  
  def start(): IDisposable = js.native
  
  def stop(): Unit = js.native
  
  /* protected abstract */ def toDateTimeOffset(duetime: TAbsolute): Double = js.native
  
  /* protected abstract */ def toRelative(duetime: Double): TRelative = js.native
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
    scheduleAbsoluteWithState: (js.Any, TAbsolute, js.Function2[/* scheduler */ typings.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable,
    schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
    schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => IDisposable,
    scheduleRelative: (TRelative, js.Function0[Unit]) => IDisposable,
    scheduleRelativeWithState: (js.Any, TRelative, js.Function2[/* scheduler */ typings.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable,
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
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled.asInstanceOf[js.Any], isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
    __obj.asInstanceOf[VirtualTimeScheduler[TAbsolute, TRelative]]
  }
  
  @scala.inline
  implicit class VirtualTimeSchedulerOps[Self <: VirtualTimeScheduler[_, _], TAbsolute, TRelative] (val x: Self with (VirtualTimeScheduler[TAbsolute, TRelative])) extends AnyVal {
    
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
    def setAdd(value: (TAbsolute, TRelative) => TAbsolute): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAdvanceBy(value: TRelative => Unit): Self = this.set("advanceBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdvanceTo(value: TAbsolute => Unit): Self = this.set("advanceTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNext(value: () => ScheduledItem[TAbsolute]): Self = this.set("getNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleAbsolute(value: (TAbsolute, js.Function0[Unit]) => IDisposable): Self = this.set("scheduleAbsolute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScheduleAbsoluteWithState(
      value: (js.Any, TAbsolute, js.Function2[/* scheduler */ typings.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable
    ): Self = this.set("scheduleAbsoluteWithState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScheduleRelative(value: (TRelative, js.Function0[Unit]) => IDisposable): Self = this.set("scheduleRelative", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScheduleRelativeWithState(
      value: (js.Any, TRelative, js.Function2[/* scheduler */ typings.rxCore.Rx.IScheduler, js.Any, IDisposable]) => IDisposable
    ): Self = this.set("scheduleRelativeWithState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSleep(value: TRelative => Unit): Self = this.set("sleep", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => IDisposable): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToDateTimeOffset(value: TAbsolute => Double): Self = this.set("toDateTimeOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToRelative(value: Double => TRelative): Self = this.set("toRelative", js.Any.fromFunction1(value))
  }
}
