package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeOnObservableMod {
  
  @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable")
  @js.native
  class SubscribeOnObservable[T] protected () extends Observable[T] {
    def this(source: Observable[T]) = this()
    def this(source: Observable[T], delayTime: Double) = this()
    def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
    def this(source: Observable[T], delayTime: Unit, scheduler: SchedulerLike) = this()
    
    /* private */ var delayTime: js.Any = js.native
    
    /* private */ var scheduler: js.Any = js.native
    
    @JSName("source")
    var source_SubscribeOnObservable: Observable[T] = js.native
  }
  /* static members */
  object SubscribeOnObservable {
    
    @JSImport("rxjs/internal/observable/SubscribeOnObservable", "SubscribeOnObservable")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def create[T](source: Observable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
    inline def create[T](source: Observable[T], delay: Double): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def create[T](source: Observable[T], delay: Unit, scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    
    /** @nocollapse */
    inline def dispatch[T](arg: DispatchArg[T]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(arg.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  }
  
  trait DispatchArg[T] extends StObject {
    
    var source: Observable[T]
    
    var subscriber: Subscriber[T]
  }
  object DispatchArg {
    
    inline def apply[T](source: Observable[T], subscriber: Subscriber[T]): DispatchArg[T] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatchArg[T]]
    }
    
    extension [Self <: DispatchArg[?], T](x: Self & DispatchArg[T]) {
      
      inline def setSource(value: Observable[T]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSubscriber(value: Subscriber[T]): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    }
  }
}
