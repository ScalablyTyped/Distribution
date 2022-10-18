package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableRangeObservableMod {
  
  @JSImport("rxjs-compat/observable/RangeObservable", "RangeObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class RangeObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object RangeObservable {
    
    @JSImport("rxjs-compat/observable/RangeObservable", "RangeObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Observable_[Double]]
    inline def create(start: Double): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any]).asInstanceOf[Observable_[Double]]
    inline def create(start: Double, count: Double): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(start: Double, count: Double, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(start: Double, count: Unit, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(start: Unit, count: Double): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(start: Unit, count: Double, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
    inline def create(start: Unit, count: Unit, scheduler: SchedulerLike): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
  }
}
