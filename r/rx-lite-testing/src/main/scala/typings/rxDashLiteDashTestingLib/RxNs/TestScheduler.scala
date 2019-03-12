package typings
package rxDashLiteDashTestingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestScheduler
  extends rxDashLiteDashVirtualtimeLib.RxNs.VirtualTimeScheduler[scala.Double, scala.Double] {
  def createColdObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T]
  def createHotObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T]
  def createObserver[T](): MockObserver[T]
  def startWithCreate[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]]): MockObserver[T]
  def startWithDispose[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]], disposedAt: scala.Double): MockObserver[T]
  def startWithTiming[T](
    create: js.Function0[rxDashCoreLib.RxNs.Observable[T]],
    createdAt: scala.Double,
    subscribedAt: scala.Double,
    disposedAt: scala.Double
  ): MockObserver[T]
}

object TestScheduler {
  @scala.inline
  def apply(
    add: (scala.Double, scala.Double) => scala.Double,
    advanceBy: scala.Double => scala.Unit,
    advanceTo: scala.Double => scala.Unit,
    createColdObservable: /* repeated */ Recorded => rxDashCoreLib.RxNs.Observable[js.Any],
    createHotObservable: /* repeated */ Recorded => rxDashCoreLib.RxNs.Observable[js.Any],
    createObserver: () => MockObserver[js.Any],
    getNext: () => rxDashLiteLib.RxNs.internalsNs.ScheduledItem[scala.Double],
    isEnabled: scala.Boolean,
    isScheduler: js.Any => scala.Boolean,
    now: () => scala.Double,
    schedule: js.Function0[scala.Unit] => rxDashCoreLib.RxNs.IDisposable,
    scheduleAbsolute: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleAbsoluteWithState: (js.Any, scala.Double, js.Function2[
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
    scheduleRelative: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRelativeWithState: (js.Any, scala.Double, js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      js.Any, 
      rxDashCoreLib.RxNs.IDisposable
    ]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithAbsolute: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithAbsoluteAndState: (js.Any, scala.Double, js.Function2[TestScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithRelative: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithRelativeAndState: (js.Any, scala.Double, js.Function2[TestScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithState: (js.Any, js.Function2[TestScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    sleep: scala.Double => scala.Unit,
    start: () => rxDashCoreLib.RxNs.IDisposable,
    startWithCreate: js.Function0[rxDashCoreLib.RxNs.Observable[js.Any]] => MockObserver[js.Any],
    startWithDispose: (js.Function0[rxDashCoreLib.RxNs.Observable[js.Any]], scala.Double) => MockObserver[js.Any],
    startWithTiming: (js.Function0[rxDashCoreLib.RxNs.Observable[js.Any]], scala.Double, scala.Double, scala.Double) => MockObserver[js.Any],
    stop: () => scala.Unit,
    toDateTimeOffset: scala.Double => scala.Double,
    toRelative: scala.Double => scala.Double
  ): TestScheduler = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), createColdObservable = js.Any.fromFunction1(createColdObservable), createHotObservable = js.Any.fromFunction1(createHotObservable), createObserver = js.Any.fromFunction0(createObserver), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled, isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), startWithCreate = js.Any.fromFunction1(startWithCreate), startWithDispose = js.Any.fromFunction2(startWithDispose), startWithTiming = js.Any.fromFunction4(startWithTiming), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
  
    __obj.asInstanceOf[TestScheduler]
  }
}

