package typings.rxLiteTesting

import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.IScheduler
import typings.rxCore.Rx.Observable
import typings.rxCore.Rx.Observer
import typings.rxLite.Rx.internals.ScheduledItem
import typings.rxLiteTesting.Rx.MockObserverStatic
import typings.rxLiteTesting.Rx.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx-lite-testing", "MockObserver")
  @js.native
  val MockObserver: MockObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-lite-testing", "MockObserver")
  @js.native
  class MockObserverCls[T] protected ()
    extends StObject
       with typings.rxLiteTesting.Rx.MockObserver[T] {
    def this(scheduler: IScheduler) = this()
    
    /* CompleteClass */
    override def checked(): Observer[js.Any] = js.native
    
    /* CompleteClass */
    var messages: js.Array[typings.rxLiteTesting.Rx.Recorded] = js.native
  }
  
  object ReactiveTest {
    
    @JSImport("rx-lite-testing", "ReactiveTest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rx-lite-testing", "ReactiveTest.created")
    @js.native
    def created: Double = js.native
    inline def created_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("created")(x.asInstanceOf[js.Any])
    
    @JSImport("rx-lite-testing", "ReactiveTest.disposed")
    @js.native
    def disposed: Double = js.native
    inline def disposed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposed")(x.asInstanceOf[js.Any])
    
    inline def onCompleted(ticks: Double): typings.rxLiteTesting.Rx.Recorded = ^.asInstanceOf[js.Dynamic].applyDynamic("onCompleted")(ticks.asInstanceOf[js.Any]).asInstanceOf[typings.rxLiteTesting.Rx.Recorded]
    
    inline def onError(ticks: Double, exception: js.Any): typings.rxLiteTesting.Rx.Recorded = (^.asInstanceOf[js.Dynamic].applyDynamic("onError")(ticks.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[typings.rxLiteTesting.Rx.Recorded]
    
    inline def onNext(ticks: Double, value: js.Any): typings.rxLiteTesting.Rx.Recorded = (^.asInstanceOf[js.Dynamic].applyDynamic("onNext")(ticks.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.rxLiteTesting.Rx.Recorded]
    
    inline def subscribe(subscribeAt: Double): typings.rxLiteTesting.Rx.Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscribeAt.asInstanceOf[js.Any]).asInstanceOf[typings.rxLiteTesting.Rx.Subscription]
    inline def subscribe(subscribeAt: Double, unsubscribeAt: Double): typings.rxLiteTesting.Rx.Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscribeAt.asInstanceOf[js.Any], unsubscribeAt.asInstanceOf[js.Any])).asInstanceOf[typings.rxLiteTesting.Rx.Subscription]
    
    @JSImport("rx-lite-testing", "ReactiveTest.subscribed")
    @js.native
    def subscribed: Double = js.native
    inline def subscribed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rx-lite-testing", "Recorded")
  @js.native
  class Recorded protected ()
    extends StObject
       with typings.rxLiteTesting.Rx.Recorded {
    def this(time: Double, value: js.Any) = this()
    def this(
      time: Double,
      value: js.Any,
      equalityComparer: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
    ) = this()
    
    /* CompleteClass */
    override def equals(other: typings.rxLiteTesting.Rx.Recorded): Boolean = js.native
    
    /* CompleteClass */
    var time: Double = js.native
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  @JSImport("rx-lite-testing", "Subscription")
  @js.native
  class Subscription protected ()
    extends StObject
       with typings.rxLiteTesting.Rx.Subscription {
    def this(subscribeAt: Double) = this()
    def this(subscribeAt: Double, unsubscribeAt: Double) = this()
    
    /* CompleteClass */
    override def equals(other: typings.rxLiteTesting.Rx.Subscription): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-lite-testing", "TestScheduler")
  @js.native
  class TestSchedulerCls ()
    extends StObject
       with TestScheduler {
    
    /* protected abstract */ /* CompleteClass */
    override def add(from: Double, by: Double): Double = js.native
    
    // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
    /* CompleteClass */
    override def advanceBy(time: Double): Unit = js.native
    
    /* CompleteClass */
    override def advanceTo(time: Double): Unit = js.native
    
    /* CompleteClass */
    override def createColdObservable[T](records: typings.rxLiteTesting.Rx.Recorded*): Observable[T] = js.native
    
    /* CompleteClass */
    override def createHotObservable[T](records: typings.rxLiteTesting.Rx.Recorded*): Observable[T] = js.native
    
    /* CompleteClass */
    override def createObserver[T](): typings.rxLiteTesting.Rx.MockObserver[T] = js.native
    
    /* protected */ /* CompleteClass */
    override def getNext(): ScheduledItem[Double] = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
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
    override def startWithCreate[T](create: js.Function0[Observable[T]]): typings.rxLiteTesting.Rx.MockObserver[T] = js.native
    
    /* CompleteClass */
    override def startWithDispose[T](create: js.Function0[Observable[T]], disposedAt: Double): typings.rxLiteTesting.Rx.MockObserver[T] = js.native
    
    /* CompleteClass */
    override def startWithTiming[T](create: js.Function0[Observable[T]], createdAt: Double, subscribedAt: Double, disposedAt: Double): typings.rxLiteTesting.Rx.MockObserver[T] = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /* protected abstract */ /* CompleteClass */
    override def toDateTimeOffset(duetime: Double): Double = js.native
    
    /* protected abstract */ /* CompleteClass */
    override def toRelative(duetime: Double): Double = js.native
  }
}
