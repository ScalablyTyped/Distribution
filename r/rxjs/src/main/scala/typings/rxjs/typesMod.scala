package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriptionMod.Subscription
import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CompletionObserver[T]
    extends StObject
       with PartialObserver[T] {
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    def complete(): Unit
    
    var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object CompletionObserver {
    
    inline def apply[T](complete: () => Unit): CompletionObserver[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[CompletionObserver[T]]
    }
    
    extension [Self <: CompletionObserver[?], T](x: Self & CompletionObserver[T]) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: /* err */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait ErrorObserver[T]
    extends StObject
       with PartialObserver[T] {
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def error(err: js.Any): Unit
    
    var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object ErrorObserver {
    
    inline def apply[T](error: js.Any => Unit): ErrorObserver[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[ErrorObserver[T]]
    }
    
    extension [Self <: ErrorObserver[?], T](x: Self & ErrorObserver[T]) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  type FactoryOrValue[T] = T | js.Function0[T]
  
  @js.native
  trait InteropObservable[T] extends StObject
  
  type MonoTypeOperatorFunction[T] = OperatorFunction[T, T]
  
  trait NextObserver[T]
    extends StObject
       with PartialObserver[T] {
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
    
    def next(value: T): Unit
  }
  object NextObserver {
    
    inline def apply[T](next: T => Unit): NextObserver[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[NextObserver[T]]
    }
    
    extension [Self <: NextObserver[?], T](x: Self & NextObserver[T]) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* err */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type ObservableInput[T] = SubscribableOrPromise[T] | ArrayLike[T] | Iterable[T]
  
  type ObservableLike[T] = InteropObservable[T]
  
  type ObservedValueOf[O] = js.Any
  
  type ObservedValuesFromArray[X] = js.Any
  
  trait Observer[T] extends StObject {
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    def complete(): Unit
    
    def error(err: js.Any): Unit
    
    def next(value: T): Unit
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, error: js.Any => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type OperatorFunction[T, R] = UnaryFunction[Observable[T], Observable[R]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rxjs.typesMod.NextObserver[T]
    - typings.rxjs.typesMod.ErrorObserver[T]
    - typings.rxjs.typesMod.CompletionObserver[T]
  */
  trait PartialObserver[T] extends StObject
  object PartialObserver {
    
    inline def CompletionObserver[T](complete: () => Unit): typings.rxjs.typesMod.CompletionObserver[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[typings.rxjs.typesMod.CompletionObserver[T]]
    }
    
    inline def ErrorObserver[T](error: js.Any => Unit): typings.rxjs.typesMod.ErrorObserver[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[typings.rxjs.typesMod.ErrorObserver[T]]
    }
    
    inline def NextObserver[T](next: T => Unit): typings.rxjs.typesMod.NextObserver[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[typings.rxjs.typesMod.NextObserver[T]]
    }
  }
  
  @js.native
  trait SchedulerAction[T] extends Subscription {
    
    def schedule(): Subscription = js.native
    def schedule(state: T): Subscription = js.native
    def schedule(state: T, delay: Double): Subscription = js.native
    def schedule(state: Unit, delay: Double): Subscription = js.native
  }
  
  @js.native
  trait SchedulerLike extends StObject {
    
    def now(): Double = js.native
    
    def schedule[T](work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]): Subscription = js.native
    def schedule[T](
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      delay: Double
    ): Subscription = js.native
    def schedule[T](
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      delay: Double,
      state: T
    ): Subscription = js.native
    def schedule[T](
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      delay: Unit,
      state: T
    ): Subscription = js.native
  }
  
  @js.native
  trait Subscribable[T] extends StObject {
    
    def subscribe(): Unsubscribable = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit]): Unsubscribable = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
    def subscribe(
      next: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): Unsubscribable = js.native
    /** @deprecated Use an observer instead of a complete callback */
    def subscribe(next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): Unsubscribable = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Unsubscribable = js.native
    /** @deprecated Use an observer instead of an error callback */
    def subscribe(next: Null, error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
    def subscribe(next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): Unsubscribable = js.native
    /** @deprecated Use an observer instead of a complete callback */
    def subscribe(next: Null, error: Null, complete: js.Function0[Unit]): Unsubscribable = js.native
    def subscribe(next: Null, error: Unit, complete: js.Function0[Unit]): Unsubscribable = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ js.Any, Unit]): Unsubscribable = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): Unsubscribable = js.native
    def subscribe(next: Unit, error: Null, complete: js.Function0[Unit]): Unsubscribable = js.native
    def subscribe(next: Unit, error: Unit, complete: js.Function0[Unit]): Unsubscribable = js.native
    def subscribe(observer: PartialObserver[T]): Unsubscribable = js.native
  }
  
  type SubscribableOrPromise[T] = (Subscribable[scala.Nothing | T]) | js.Thenable[T] | InteropObservable[T]
  
  trait SubscriptionLike
    extends StObject
       with Unsubscribable {
    
    val closed: Boolean
  }
  object SubscriptionLike {
    
    inline def apply(closed: Boolean, unsubscribe: () => Unit): SubscriptionLike = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[SubscriptionLike]
    }
    
    extension [Self <: SubscriptionLike](x: Self) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    }
  }
  
  type TeardownLogic = Unsubscribable | js.Function | Unit
  
  trait TimeInterval[T] extends StObject {
    
    var interval: Double
    
    var value: T
  }
  object TimeInterval {
    
    inline def apply[T](interval: Double, value: T): TimeInterval[T] = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeInterval[T]]
    }
    
    extension [Self <: TimeInterval[?], T](x: Self & TimeInterval[T]) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timestamp[T] extends StObject {
    
    var timestamp: Double
    
    var value: T
  }
  object Timestamp {
    
    inline def apply[T](timestamp: Double, value: T): Timestamp[T] = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp[T]]
    }
    
    extension [Self <: Timestamp[?], T](x: Self & Timestamp[T]) {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
  
  trait Unsubscribable extends StObject {
    
    def unsubscribe(): Unit
  }
  object Unsubscribable {
    
    inline def apply(unsubscribe: () => Unit): Unsubscribable = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Unsubscribable]
    }
    
    extension [Self <: Unsubscribable](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
