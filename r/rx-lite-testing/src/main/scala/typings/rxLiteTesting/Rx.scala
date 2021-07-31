package typings.rxLiteTesting

import org.scalablytyped.runtime.Instantiable1
import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.IScheduler
import typings.rxCore.Rx.Observable
import typings.rxCore.Rx.Observer
import typings.rxCore.Rx.ObserverStatic
import typings.rxLite.Rx.internals.ScheduledItem
import typings.rxLiteVirtualtime.Rx.VirtualTimeScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  trait MockObserver[T]
    extends StObject
       with Observer[T] {
    
    var messages: js.Array[Recorded]
  }
  object MockObserver {
    
    @scala.inline
    def apply[T](checked: () => Observer[js.Any], messages: js.Array[Recorded]): MockObserver[T] = {
      val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockObserver[T]]
    }
    
    @scala.inline
    implicit class MockObserverMutableBuilder[Self <: MockObserver[?], T] (val x: Self & MockObserver[T]) extends AnyVal {
      
      @scala.inline
      def setMessages(value: js.Array[Recorded]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: Recorded*): Self = StObject.set(x, "messages", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MockObserverStatic
    extends StObject
       with ObserverStatic
       with Instantiable1[/* scheduler */ IScheduler, MockObserver[js.Object]]
  
  trait Recorded extends StObject {
    
    def equals(other: Recorded): Boolean
    
    var time: Double
    
    var value: js.Any
  }
  object Recorded {
    
    @scala.inline
    def apply(equals_ : Recorded => Boolean, time: Double, value: js.Any): Recorded = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Recorded]
    }
    
    @scala.inline
    implicit class RecordedMutableBuilder[Self <: Recorded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: Recorded => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription extends StObject {
    
    def equals(other: Subscription): Boolean
  }
  object Subscription {
    
    @scala.inline
    def apply(equals_ : Subscription => Boolean): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: Subscription => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
  
  trait TestScheduler
    extends StObject
       with VirtualTimeScheduler[Double, Double] {
    
    def createColdObservable[T](records: Recorded*): Observable[T]
    
    def createHotObservable[T](records: Recorded*): Observable[T]
    
    def createObserver[T](): MockObserver[T]
    
    def startWithCreate[T](create: js.Function0[Observable[T]]): MockObserver[T]
    
    def startWithDispose[T](create: js.Function0[Observable[T]], disposedAt: Double): MockObserver[T]
    
    def startWithTiming[T](create: js.Function0[Observable[T]], createdAt: Double, subscribedAt: Double, disposedAt: Double): MockObserver[T]
  }
  object TestScheduler {
    
    @scala.inline
    def apply(
      add: (Double, Double) => Double,
      advanceBy: Double => Unit,
      advanceTo: Double => Unit,
      createColdObservable: /* repeated */ Recorded => Observable[js.Any],
      createHotObservable: /* repeated */ Recorded => Observable[js.Any],
      createObserver: () => MockObserver[js.Any],
      getNext: () => ScheduledItem[Double],
      isEnabled: Boolean,
      isScheduler: js.Any => Boolean,
      now: () => Double,
      schedule: js.Function0[Unit] => IDisposable,
      scheduleAbsolute: (Double, js.Function0[Unit]) => IDisposable,
      scheduleAbsoluteWithState: (js.Any, Double, js.Function2[/* scheduler */ IScheduler, js.Any, IDisposable]) => IDisposable,
      schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
      schedulePeriodicWithState: (js.Any, Double, js.Function1[js.Any, js.Any]) => IDisposable,
      scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
      scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithAbsoluteAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithRelativeAndState: (js.Any, Double, js.Function2[js.Any, /* action */ js.Function2[js.Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, Unit], Unit]) => IDisposable,
      scheduleRelative: (Double, js.Function0[Unit]) => IDisposable,
      scheduleRelativeWithState: (js.Any, Double, js.Function2[/* scheduler */ IScheduler, js.Any, IDisposable]) => IDisposable,
      scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
      scheduleWithAbsoluteAndState: (js.Any, Double, js.Function2[TestScheduler, js.Any, IDisposable]) => IDisposable,
      scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
      scheduleWithRelativeAndState: (js.Any, Double, js.Function2[TestScheduler, js.Any, IDisposable]) => IDisposable,
      scheduleWithState: (js.Any, js.Function2[TestScheduler, js.Any, IDisposable]) => IDisposable,
      sleep: Double => Unit,
      start: () => IDisposable,
      startWithCreate: js.Function0[Observable[js.Any]] => MockObserver[js.Any],
      startWithDispose: (js.Function0[Observable[js.Any]], Double) => MockObserver[js.Any],
      startWithTiming: (js.Function0[Observable[js.Any]], Double, Double, Double) => MockObserver[js.Any],
      stop: () => Unit,
      toDateTimeOffset: Double => Double,
      toRelative: Double => Double
    ): TestScheduler = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), createColdObservable = js.Any.fromFunction1(createColdObservable), createHotObservable = js.Any.fromFunction1(createHotObservable), createObserver = js.Any.fromFunction0(createObserver), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled.asInstanceOf[js.Any], isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), startWithCreate = js.Any.fromFunction1(startWithCreate), startWithDispose = js.Any.fromFunction2(startWithDispose), startWithTiming = js.Any.fromFunction4(startWithTiming), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
      __obj.asInstanceOf[TestScheduler]
    }
    
    @scala.inline
    implicit class TestSchedulerMutableBuilder[Self <: TestScheduler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateColdObservable(value: /* repeated */ Recorded => Observable[js.Any]): Self = StObject.set(x, "createColdObservable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateHotObservable(value: /* repeated */ Recorded => Observable[js.Any]): Self = StObject.set(x, "createHotObservable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateObserver(value: () => MockObserver[js.Any]): Self = StObject.set(x, "createObserver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartWithCreate(value: js.Function0[Observable[js.Any]] => MockObserver[js.Any]): Self = StObject.set(x, "startWithCreate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartWithDispose(value: (js.Function0[Observable[js.Any]], Double) => MockObserver[js.Any]): Self = StObject.set(x, "startWithDispose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartWithTiming(value: (js.Function0[Observable[js.Any]], Double, Double, Double) => MockObserver[js.Any]): Self = StObject.set(x, "startWithTiming", js.Any.fromFunction4(value))
    }
  }
}
