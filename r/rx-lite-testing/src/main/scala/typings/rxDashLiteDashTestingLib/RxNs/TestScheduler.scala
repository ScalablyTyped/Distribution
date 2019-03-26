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

@JSGlobal("Rx.TestScheduler")
@js.native
class TestSchedulerCls () extends TestScheduler {
  /* CompleteClass */
  override var isEnabled: scala.Boolean = js.native
  /* protected abstract */ /* CompleteClass */
  override def add(from: scala.Double, by: scala.Double): scala.Double = js.native
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  /* CompleteClass */
  override def advanceBy(time: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def advanceTo(time: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def createColdObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T] = js.native
  /* CompleteClass */
  override def createHotObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T] = js.native
  /* CompleteClass */
  override def createObserver[T](): MockObserver[T] = js.native
  /* protected */ /* CompleteClass */
  override def getNext(): rxDashLiteLib.RxNs.internalsNs.ScheduledItem[scala.Double] = js.native
  /* CompleteClass */
  override def isScheduler(value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def now(): scala.Double = js.native
  /* CompleteClass */
  override def schedule(action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleAbsolute(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def schedulePeriodic(period: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def schedulePeriodicWithState[TState](state: TState, period: scala.Double, action: js.Function1[/* state */ TState, TState]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursive(action: js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithAbsolute(
    dueTime: scala.Double,
    action: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithAbsoluteAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithRelative(
    dueTime: scala.Double,
    action: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithRelativeAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithState[TState](
    state: TState,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function1[/* state */ TState, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRelative(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithAbsolute(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithAbsoluteAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithRelative(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithRelativeAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithState[TState](
    state: TState,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def sleep(time: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def start(): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def startWithCreate[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]]): MockObserver[T] = js.native
  /* CompleteClass */
  override def startWithDispose[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]], disposedAt: scala.Double): MockObserver[T] = js.native
  /* CompleteClass */
  override def startWithTiming[T](
    create: js.Function0[rxDashCoreLib.RxNs.Observable[T]],
    createdAt: scala.Double,
    subscribedAt: scala.Double,
    disposedAt: scala.Double
  ): MockObserver[T] = js.native
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
  /* protected abstract */ /* CompleteClass */
  override def toDateTimeOffset(duetime: scala.Double): scala.Double = js.native
  /* protected abstract */ /* CompleteClass */
  override def toRelative(duetime: scala.Double): scala.Double = js.native
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

