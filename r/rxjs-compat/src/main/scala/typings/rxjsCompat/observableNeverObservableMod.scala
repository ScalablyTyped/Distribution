package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableNeverObservableMod {
  
  @JSImport("rxjs-compat/observable/NeverObservable", "NeverObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class NeverObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object NeverObservable {
    
    @JSImport("rxjs-compat/observable/NeverObservable", "NeverObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](): Observable_[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Observable_[scala.Nothing]]
  }
}
