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

@JSGlobal("Rx.TestScheduler")
@js.native
object TestScheduler
  extends org.scalablytyped.runtime.Instantiable0[TestScheduler]

