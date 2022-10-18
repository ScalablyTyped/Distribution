package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.distTypesInternalTypesMod.Unsubscribable
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableUsingObservableMod {
  
  @JSImport("rxjs-compat/observable/UsingObservable", "UsingObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class UsingObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object UsingObservable {
    
    @JSImport("rxjs-compat/observable/UsingObservable", "UsingObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      resourceFactory: js.Function0[Unsubscribable | Unit],
      observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, SubscribableOrPromise[T] | Unit]
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  }
}
