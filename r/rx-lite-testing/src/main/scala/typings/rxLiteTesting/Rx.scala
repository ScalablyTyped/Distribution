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
    
    inline def apply[T](checked: () => Observer[Any], messages: js.Array[Recorded]): MockObserver[T] = {
      val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockObserver[T]]
    }
    
    extension [Self <: MockObserver[?], T](x: Self & MockObserver[T]) {
      
      inline def setMessages(value: js.Array[Recorded]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: Recorded*): Self = StObject.set(x, "messages", js.Array(value*))
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
    
    var value: Any
  }
  object Recorded {
    
    inline def apply(equals_ : Recorded => Boolean, time: Double, value: Any): Recorded = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Recorded]
    }
    
    extension [Self <: Recorded](x: Self) {
      
      inline def setEquals_(value: Recorded => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription extends StObject {
    
    def equals(other: Subscription): Boolean
  }
  object Subscription {
    
    inline def apply(equals_ : Subscription => Boolean): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setEquals_(value: Subscription => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
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
    
    inline def apply(
      add: (Double, Double) => Double,
      advanceBy: Double => Unit,
      advanceTo: Double => Unit,
      createColdObservable: /* repeated */ Recorded => Observable[Any],
      createHotObservable: /* repeated */ Recorded => Observable[Any],
      createObserver: () => MockObserver[Any],
      getNext: () => ScheduledItem[Double],
      isEnabled: Boolean,
      isScheduler: Any => Boolean,
      now: () => Double,
      schedule: js.Function0[Unit] => IDisposable,
      scheduleAbsolute: (Double, js.Function0[Unit]) => IDisposable,
      scheduleAbsoluteWithState: (Any, Double, js.Function2[/* scheduler */ IScheduler, Any, IDisposable]) => IDisposable,
      schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
      schedulePeriodicWithState: (Any, Double, js.Function1[Any, Any]) => IDisposable,
      scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
      scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithAbsoluteAndState: (Any, Double, js.Function2[Any, /* action */ js.Function2[Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithRelativeAndState: (Any, Double, js.Function2[Any, /* action */ js.Function2[Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
      scheduleRecursiveWithState: (Any, js.Function2[Any, /* action */ js.Function1[Any, Unit], Unit]) => IDisposable,
      scheduleRelative: (Double, js.Function0[Unit]) => IDisposable,
      scheduleRelativeWithState: (Any, Double, js.Function2[/* scheduler */ IScheduler, Any, IDisposable]) => IDisposable,
      scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
      scheduleWithAbsoluteAndState: (Any, Double, js.Function2[TestScheduler, Any, IDisposable]) => IDisposable,
      scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
      scheduleWithRelativeAndState: (Any, Double, js.Function2[TestScheduler, Any, IDisposable]) => IDisposable,
      scheduleWithState: (Any, js.Function2[TestScheduler, Any, IDisposable]) => IDisposable,
      sleep: Double => Unit,
      start: () => IDisposable,
      startWithCreate: js.Function0[Observable[Any]] => MockObserver[Any],
      startWithDispose: (js.Function0[Observable[Any]], Double) => MockObserver[Any],
      startWithTiming: (js.Function0[Observable[Any]], Double, Double, Double) => MockObserver[Any],
      stop: () => Unit,
      toDateTimeOffset: Double => Double,
      toRelative: Double => Double
    ): TestScheduler = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), advanceBy = js.Any.fromFunction1(advanceBy), advanceTo = js.Any.fromFunction1(advanceTo), createColdObservable = js.Any.fromFunction1(createColdObservable), createHotObservable = js.Any.fromFunction1(createHotObservable), createObserver = js.Any.fromFunction0(createObserver), getNext = js.Any.fromFunction0(getNext), isEnabled = isEnabled.asInstanceOf[js.Any], isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), scheduleAbsolute = js.Any.fromFunction2(scheduleAbsolute), scheduleAbsoluteWithState = js.Any.fromFunction3(scheduleAbsoluteWithState), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRelative = js.Any.fromFunction2(scheduleRelative), scheduleRelativeWithState = js.Any.fromFunction3(scheduleRelativeWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState), sleep = js.Any.fromFunction1(sleep), start = js.Any.fromFunction0(start), startWithCreate = js.Any.fromFunction1(startWithCreate), startWithDispose = js.Any.fromFunction2(startWithDispose), startWithTiming = js.Any.fromFunction4(startWithTiming), stop = js.Any.fromFunction0(stop), toDateTimeOffset = js.Any.fromFunction1(toDateTimeOffset), toRelative = js.Any.fromFunction1(toRelative))
      __obj.asInstanceOf[TestScheduler]
    }
    
    extension [Self <: TestScheduler](x: Self) {
      
      inline def setCreateColdObservable(value: /* repeated */ Recorded => Observable[Any]): Self = StObject.set(x, "createColdObservable", js.Any.fromFunction1(value))
      
      inline def setCreateHotObservable(value: /* repeated */ Recorded => Observable[Any]): Self = StObject.set(x, "createHotObservable", js.Any.fromFunction1(value))
      
      inline def setCreateObserver(value: () => MockObserver[Any]): Self = StObject.set(x, "createObserver", js.Any.fromFunction0(value))
      
      inline def setStartWithCreate(value: js.Function0[Observable[Any]] => MockObserver[Any]): Self = StObject.set(x, "startWithCreate", js.Any.fromFunction1(value))
      
      inline def setStartWithDispose(value: (js.Function0[Observable[Any]], Double) => MockObserver[Any]): Self = StObject.set(x, "startWithDispose", js.Any.fromFunction2(value))
      
      inline def setStartWithTiming(value: (js.Function0[Observable[Any]], Double, Double, Double) => MockObserver[Any]): Self = StObject.set(x, "startWithTiming", js.Any.fromFunction4(value))
    }
  }
}
