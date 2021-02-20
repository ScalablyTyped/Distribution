package typings.rxjs

import typings.rxjs.notificationMod.Notification
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.PartialObserver
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observeOnMod {
  
  @JSImport("rxjs/internal/operators/observeOn", "ObserveOnMessage")
  @js.native
  class ObserveOnMessage protected () extends StObject {
    def this(notification: Notification[_], destination: PartialObserver[_]) = this()
    
    var destination: PartialObserver[_] = js.native
    
    var notification: Notification[_] = js.native
  }
  
  @JSImport("rxjs/internal/operators/observeOn", "ObserveOnOperator")
  @js.native
  class ObserveOnOperator[T] protected () extends Operator[T, T] {
    def this(scheduler: SchedulerLike) = this()
    def this(scheduler: SchedulerLike, delay: Double) = this()
    
    var delay: js.Any = js.native
    
    var scheduler: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/observeOn", "ObserveOnSubscriber")
  @js.native
  class ObserveOnSubscriber[T] protected () extends Subscriber[T] {
    def this(destination: Subscriber[T], scheduler: SchedulerLike) = this()
    def this(destination: Subscriber[T], scheduler: SchedulerLike, delay: Double) = this()
    
    var delay: js.Any = js.native
    
    var scheduleMessage: js.Any = js.native
    
    var scheduler: js.Any = js.native
  }
  /* static members */
  object ObserveOnSubscriber {
    
    /** @nocollapse */
    @JSImport("rxjs/internal/operators/observeOn", "ObserveOnSubscriber.dispatch")
    @js.native
    def dispatch(arg: ObserveOnMessage): Unit = js.native
  }
  
  @JSImport("rxjs/internal/operators/observeOn", "observeOn")
  @js.native
  def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/observeOn", "observeOn")
  @js.native
  def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
}
