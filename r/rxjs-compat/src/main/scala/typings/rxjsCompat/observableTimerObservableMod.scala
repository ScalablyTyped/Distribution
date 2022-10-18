package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableTimerObservableMod {
  
  @JSImport("rxjs-compat/observable/TimerObservable", "TimerObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class TimerObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object TimerObservable {
    
    @JSImport("rxjs-compat/observable/TimerObservable", "TimerObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: js.Date): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any]).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: js.Date, period: Double): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: js.Date, period: Double, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: js.Date, period: Unit, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: js.Date, period: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: js.Date, period: SchedulerLike, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Double): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any]).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Double, period: Double): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Double, period: Double, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Double, period: Unit, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Double, period: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Double, period: SchedulerLike, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Unit, period: Double): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Unit, period: Double, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Unit, period: Unit, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Unit, period: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(initialDelay: Unit, period: SchedulerLike, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
  }
}
