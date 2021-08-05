package typings.rxjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.rxjs.coldObservableMod.ColdObservable
import typings.rxjs.hotObservableMod.HotObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.testSchedulerMod.observableToBeFn
import typings.rxjs.testSchedulerMod.subscriptionLogsToBeFn
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.SubscribableOrPromise
import typings.std.Response
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](marbles: String): HotObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T]): HotObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T], error: js.Any): HotObservable[T] = js.native
    def apply[T](marbles: String, values: Unit, error: js.Any): HotObservable[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
    def apply[T, F](condition: js.Function0[Boolean], trueResult: Unit, falseResult: SubscribableOrPromise[F]): Observable[T | F] = js.native
    def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
    def apply[T, F](
      condition: js.Function0[Boolean],
      trueResult: SubscribableOrPromise[T],
      falseResult: SubscribableOrPromise[F]
    ): Observable[T | F] = js.native
  }
  
  @js.native
  trait FnCallMarblesValuesError extends StObject {
    
    def apply[T](marbles: String): ColdObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T], error: js.Any): ColdObservable[T] = js.native
    def apply[T](marbles: String, values: Unit, error: js.Any): ColdObservable[T] = js.native
  }
  
  trait Index[T] extends StObject {
    
    var index: Double
    
    var keys: js.Array[String]
    
    var obj: js.Object
    
    var subscriber: Subscriber[js.Tuple2[String, T]]
    
    var subscription: Subscription
  }
  object Index {
    
    inline def apply[T](
      index: Double,
      keys: js.Array[String],
      obj: js.Object,
      subscriber: Subscriber[js.Tuple2[String, T]],
      subscription: Subscription
    ): Index[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    extension [Self <: Index[?], T](x: Self & Index[T]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      inline def setObj(value: js.Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      inline def setSubscriber(value: Subscriber[js.Tuple2[String, T]]): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
      
      inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* url */ String, WebSocket]
       with Instantiable2[
          /* url */ String, 
          (/* protocols */ js.Array[String]) | (/* protocols */ String), 
          WebSocket
        ]
  
  trait Selector[T] extends StObject {
    
    def selector(response: Response): ObservableInput[T]
  }
  object Selector {
    
    inline def apply[T](selector: Response => ObservableInput[T]): Selector[T] = {
      val __obj = js.Dynamic.literal(selector = js.Any.fromFunction1(selector))
      __obj.asInstanceOf[Selector[T]]
    }
    
    extension [Self <: Selector[?], T](x: Self & Selector[T]) {
      
      inline def setSelector(value: Response => ObservableInput[T]): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    }
  }
  
  trait ToBe extends StObject {
    
    def toBe(marbles: String): Unit
    def toBe(marbles: String, values: js.Any): Unit
    def toBe(marbles: String, values: js.Any, errorValue: js.Any): Unit
    def toBe(marbles: String, values: Unit, errorValue: js.Any): Unit
    @JSName("toBe")
    var toBe_Original: observableToBeFn
  }
  object ToBe {
    
    inline def apply(
      toBe: (/* marbles */ String, /* values */ js.UndefOr[js.Any], /* errorValue */ js.UndefOr[js.Any]) => Unit
    ): ToBe = {
      val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction3(toBe))
      __obj.asInstanceOf[ToBe]
    }
    
    extension [Self <: ToBe](x: Self) {
      
      inline def setToBe(
        value: (/* marbles */ String, /* values */ js.UndefOr[js.Any], /* errorValue */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "toBe", js.Any.fromFunction3(value))
    }
  }
  
  trait ToBeSubscriptionLogsToBeFn extends StObject {
    
    def toBe(marbles: String): Unit
    def toBe(marbles: js.Array[String]): Unit
    @JSName("toBe")
    var toBe_Original: subscriptionLogsToBeFn
  }
  object ToBeSubscriptionLogsToBeFn {
    
    inline def apply(toBe: /* marbles */ String | js.Array[String] => Unit): ToBeSubscriptionLogsToBeFn = {
      val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1(toBe))
      __obj.asInstanceOf[ToBeSubscriptionLogsToBeFn]
    }
    
    extension [Self <: ToBeSubscriptionLogsToBeFn](x: Self) {
      
      inline def setToBe(value: /* marbles */ String | js.Array[String] => Unit): Self = StObject.set(x, "toBe", js.Any.fromFunction1(value))
    }
  }
}
