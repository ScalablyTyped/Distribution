package typings.rxjs

import typings.rxjs.notificationMod.Notification
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.PartialObserver
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observeOnMod {
  
  @JSImport("rxjs/internal/operators/observeOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/observeOn", "ObserveOnMessage")
  @js.native
  class ObserveOnMessage protected () extends StObject {
    def this(notification: Notification[js.Any], destination: PartialObserver[js.Any]) = this()
    
    var destination: PartialObserver[js.Any] = js.native
    
    var notification: Notification[js.Any] = js.native
  }
  
  @JSImport("rxjs/internal/operators/observeOn", "ObserveOnOperator")
  @js.native
  class ObserveOnOperator[T] protected ()
    extends StObject
       with Operator[T, T] {
    def this(scheduler: SchedulerLike) = this()
    def this(scheduler: SchedulerLike, delay: Double) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[T], source: js.Any): TeardownLogic = js.native
    
    /* private */ var delay: js.Any = js.native
    
    /* private */ var scheduler: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/observeOn", "ObserveOnSubscriber")
  @js.native
  class ObserveOnSubscriber[T] protected () extends Subscriber[T] {
    def this(destination: Subscriber[T], scheduler: SchedulerLike) = this()
    def this(destination: Subscriber[T], scheduler: SchedulerLike, delay: Double) = this()
    
    /* private */ var delay: js.Any = js.native
    
    /* private */ var scheduleMessage: js.Any = js.native
    
    /* private */ var scheduler: js.Any = js.native
  }
  /* static members */
  object ObserveOnSubscriber {
    
    @JSImport("rxjs/internal/operators/observeOn", "ObserveOnSubscriber")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    inline def dispatch(arg: ObserveOnMessage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
