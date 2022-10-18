package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableIfObservableMod {
  
  @JSImport("rxjs-compat/observable/IfObservable", "IfObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class IfObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object IfObservable {
    
    @JSImport("rxjs-compat/observable/IfObservable", "IfObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T, R](condition: js.Function0[Boolean | Unit]): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | R]]
    inline def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
    inline def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit, elseSource: Unit): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
    inline def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit, elseSource: SubscribableOrPromise[R]): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
    inline def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: SubscribableOrPromise[T]): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
    inline def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: SubscribableOrPromise[T], elseSource: Unit): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
    inline def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: SubscribableOrPromise[T],
      elseSource: SubscribableOrPromise[R]
    ): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
  }
}
