package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableErrorObservableMod {
  
  @JSImport("rxjs-compat/observable/ErrorObservable", "ErrorObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class ErrorObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object ErrorObservable {
    
    @JSImport("rxjs-compat/observable/ErrorObservable", "ErrorObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](error: Any): Observable_[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(error.asInstanceOf[js.Any]).asInstanceOf[Observable_[scala.Nothing]]
    inline def create[T](error: Any, scheduler: SchedulerLike): Observable_[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[scala.Nothing]]
  }
}
