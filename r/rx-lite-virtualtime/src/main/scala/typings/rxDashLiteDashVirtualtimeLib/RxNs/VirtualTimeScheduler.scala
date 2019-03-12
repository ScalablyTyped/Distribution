package typings
package rxDashLiteDashVirtualtimeLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualTimeScheduler[TAbsolute, TRelative]
  extends rxDashLiteLib.RxNs.IScheduler {
  var isEnabled: scala.Boolean
  /* protected abstract */ def add(from: TAbsolute, by: TRelative): TAbsolute
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  def advanceBy(time: TRelative): scala.Unit
  def advanceTo(time: TAbsolute): scala.Unit
  /* protected */ def getNext(): rxDashLiteLib.RxNs.internalsNs.ScheduledItem[TAbsolute]
  def scheduleAbsolute(dueTime: TAbsolute, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: TAbsolute,
    action: js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRelative(dueTime: TRelative, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def sleep(time: TRelative): scala.Unit
  def start(): rxDashCoreLib.RxNs.IDisposable
  def stop(): scala.Unit
  /* protected abstract */ def toDateTimeOffset(duetime: TAbsolute): scala.Double
  /* protected abstract */ def toRelative(duetime: scala.Double): TRelative
}

object VirtualTimeScheduler {
  @scala.inline
  def apply[TAbsolute, TRelative](
    add: (TAbsolute, TRelative) => TAbsolute,
    advanceBy: TRelative => scala.Unit,
    advanceTo: TAbsolute => scala.Unit,
    getNext: () => rxDashLiteLib.RxNs.internalsNs.ScheduledItem[TAbsolute],
    isEnabled: scala.Boolean,
    isScheduler: js.Any => scala.Boolean,
    now: () => scala.Double,
    schedule: js.Function0[scala.Unit] => rxDashCoreLib.RxNs.IDisposable,
    scheduleAbsolute: (TAbsolute, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleAbsoluteWithState: (js.Any, TAbsolute, js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      js.Any, 
      rxDashCoreLib.RxNs.IDisposable
    ]) => rxDashCoreLib.RxNs.IDisposable,
    schedulePeriodic: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    schedulePeriodicWithState: (js.Any, scala.Double, js.Function1[js.Any, js.Any]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit] => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithAbsolute: (scala.Double, js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (js.Any, scala.Double, js.Function2[
      js.Any, 
      /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithRelative: (scala.Double, js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithRelativeAndState: (js.Any, scala.Double, js.Function2[
      js.Any, 
      /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, scala.Unit], scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRelative: (TRelative, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRelativeWithState: (js.Any, TRelative, js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      js.Any, 
      rxDashCoreLib.RxNs.IDisposable
    ]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithAbsolute: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithAbsoluteAndState: (js.Any, scala.Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithRelative: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithRelativeAndState: (js.Any, scala.Double, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithState: (js.Any, js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    sleep: TRelative => scala.Unit,
    start: () => rxDashCoreLib.RxNs.IDisposable,
    stop: () => scala.Unit,
    toDateTimeOffset: TAbsolute => scala.Double,
    toRelative: scala.Double => TRelative
  ): VirtualTimeScheduler[TAbsolute, TRelative] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled, isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
  
    __obj.asInstanceOf[VirtualTimeScheduler[TAbsolute, TRelative]]
  }
}

