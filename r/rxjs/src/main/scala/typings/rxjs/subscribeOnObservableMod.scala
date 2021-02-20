package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeOnObservableMod {
  
  @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable")
  @js.native
  class SubscribeOnObservable[T] protected () extends Observable[T] {
    def this(source: Observable[T]) = this()
    def this(source: Observable[T], delayTime: Double) = this()
    def this(source: Observable[T], delayTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike) = this()
    def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
    
    var delayTime: js.Any = js.native
    
    var scheduler: js.Any = js.native
    
    @JSName("source")
    var source_SubscribeOnObservable: Observable[T] = js.native
  }
  /* static members */
  object SubscribeOnObservable {
    
    /** @nocollapse */
    @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T]): Observable[T] = js.native
    @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T], delay: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[T] = js.native
    @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T], delay: Double): Observable[T] = js.native
    @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable.dispatch")
    @js.native
    def dispatch[T](arg: DispatchArg[T]): Subscription = js.native
  }
  
  @js.native
  trait DispatchArg[T] extends StObject {
    
    var source: Observable[T] = js.native
    
    var subscriber: Subscriber[T] = js.native
  }
  object DispatchArg {
    
    @scala.inline
    def apply[T](source: Observable[T], subscriber: Subscriber[T]): DispatchArg[T] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatchArg[T]]
    }
    
    @scala.inline
    implicit class DispatchArgMutableBuilder[Self <: DispatchArg[_], T] (val x: Self with DispatchArg[T]) extends AnyVal {
      
      @scala.inline
      def setSource(value: Observable[T]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriber(value: Subscriber[T]): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    }
  }
}
