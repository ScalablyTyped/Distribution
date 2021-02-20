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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](marbles: String): HotObservable[T] = js.native
    def apply[T](marbles: String, values: js.UndefOr[scala.Nothing], error: js.Any): HotObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T]): HotObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T], error: js.Any): HotObservable[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
    def apply[T, F](
      condition: js.Function0[Boolean],
      trueResult: js.UndefOr[SubscribableOrPromise[T]],
      falseResult: SubscribableOrPromise[F]
    ): Observable[T | F] = js.native
    def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
  }
  
  @js.native
  trait FnCallMarblesValuesError extends StObject {
    
    def apply[T](marbles: String): ColdObservable[T] = js.native
    def apply[T](marbles: String, values: js.UndefOr[scala.Nothing], error: js.Any): ColdObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T]): ColdObservable[T] = js.native
    def apply[T](marbles: String, values: StringDictionary[T], error: js.Any): ColdObservable[T] = js.native
  }
  
  @js.native
  trait Index[T] extends StObject {
    
    var index: Double = js.native
    
    var keys: js.Array[String] = js.native
    
    var obj: js.Object = js.native
    
    var subscriber: Subscriber[js.Tuple2[String, T]] = js.native
    
    var subscription: Subscription = js.native
  }
  object Index {
    
    @scala.inline
    def apply[T](
      index: Double,
      keys: js.Array[String],
      obj: js.Object,
      subscriber: Subscriber[js.Tuple2[String, T]],
      subscription: Subscription
    ): Index[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setObj(value: js.Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriber(value: Subscriber[js.Tuple2[String, T]]): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* url */ String, WebSocket]
       with Instantiable2[
          /* url */ String, 
          (/* protocols */ js.Array[String]) | (/* protocols */ String), 
          WebSocket
        ]
  
  @js.native
  trait Selector[T] extends StObject {
    
    def selector(response: Response): ObservableInput[T] = js.native
  }
  object Selector {
    
    @scala.inline
    def apply[T](selector: Response => ObservableInput[T]): Selector[T] = {
      val __obj = js.Dynamic.literal(selector = js.Any.fromFunction1(selector))
      __obj.asInstanceOf[Selector[T]]
    }
    
    @scala.inline
    implicit class SelectorMutableBuilder[Self <: Selector[_], T] (val x: Self with Selector[T]) extends AnyVal {
      
      @scala.inline
      def setSelector(value: Response => ObservableInput[T]): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ToBe extends StObject {
    
    def toBe(marbles: String): Unit = js.native
    def toBe(marbles: String, values: js.UndefOr[scala.Nothing], errorValue: js.Any): Unit = js.native
    def toBe(marbles: String, values: js.Any): Unit = js.native
    def toBe(marbles: String, values: js.Any, errorValue: js.Any): Unit = js.native
    @JSName("toBe")
    var toBe_Original: observableToBeFn = js.native
  }
  
  @js.native
  trait ToBeSubscriptionLogsToBeFn extends StObject {
    
    def toBe(marbles: String): Unit = js.native
    def toBe(marbles: js.Array[String]): Unit = js.native
    @JSName("toBe")
    var toBe_Original: subscriptionLogsToBeFn = js.native
  }
}
