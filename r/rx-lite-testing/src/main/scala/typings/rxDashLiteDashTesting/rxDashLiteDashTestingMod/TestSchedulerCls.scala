package typings.rxDashLiteDashTesting.rxDashLiteDashTestingMod

import typings.rxDashCore.Rx.IDisposable
import typings.rxDashCore.Rx.IScheduler
import typings.rxDashCore.Rx.Observable
import typings.rxDashLite.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite-testing", "TestScheduler")
@js.native
class TestSchedulerCls ()
  extends typings.rxDashLiteDashTesting.Rx.TestScheduler {
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /* protected abstract */ /* CompleteClass */
  override def add(from: Double, by: Double): Double = js.native
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  /* CompleteClass */
  override def advanceBy(time: Double): Unit = js.native
  /* CompleteClass */
  override def advanceTo(time: Double): Unit = js.native
  /* CompleteClass */
  override def createColdObservable[T](records: typings.rxDashLiteDashTesting.Rx.Recorded*): Observable[T] = js.native
  /* CompleteClass */
  override def createHotObservable[T](records: typings.rxDashLiteDashTesting.Rx.Recorded*): Observable[T] = js.native
  /* CompleteClass */
  override def createObserver[T](): typings.rxDashLiteDashTesting.Rx.MockObserver[T] = js.native
  /* protected */ /* CompleteClass */
  override def getNext(): ScheduledItem[Double] = js.native
  /* CompleteClass */
  override def isScheduler(value: js.Any): Boolean = js.native
  /* CompleteClass */
  override def now(): Double = js.native
  /* CompleteClass */
  override def schedule(action: js.Function0[Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleAbsolute(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ IScheduler, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  /* CompleteClass */
  override def schedulePeriodic(period: Double, action: js.Function0[Unit]): IDisposable = js.native
  /* CompleteClass */
  override def schedulePeriodicWithState[TState](state: TState, period: Double, action: js.Function1[/* state */ TState, TState]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursive(action: js.Function1[/* action */ js.Function0[Unit], Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithAbsolute(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithAbsoluteAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithRelative(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithRelativeAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithState[TState](
    state: TState,
    action: js.Function2[/* state */ TState, /* action */ js.Function1[/* state */ TState, Unit], Unit]
  ): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRelative(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ IScheduler, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithAbsolute(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithAbsoluteAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithRelative(dueTime: Double, action: js.Function0[Unit]): IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithRelativeAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithState[TState](state: TState, action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]): IDisposable = js.native
  /* CompleteClass */
  override def sleep(time: Double): Unit = js.native
  /* CompleteClass */
  override def start(): IDisposable = js.native
  /* CompleteClass */
  override def startWithCreate[T](create: js.Function0[Observable[T]]): typings.rxDashLiteDashTesting.Rx.MockObserver[T] = js.native
  /* CompleteClass */
  override def startWithDispose[T](create: js.Function0[Observable[T]], disposedAt: Double): typings.rxDashLiteDashTesting.Rx.MockObserver[T] = js.native
  /* CompleteClass */
  override def startWithTiming[T](create: js.Function0[Observable[T]], createdAt: Double, subscribedAt: Double, disposedAt: Double): typings.rxDashLiteDashTesting.Rx.MockObserver[T] = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
  /* protected abstract */ /* CompleteClass */
  override def toDateTimeOffset(duetime: Double): Double = js.native
  /* protected abstract */ /* CompleteClass */
  override def toRelative(duetime: Double): Double = js.native
}

