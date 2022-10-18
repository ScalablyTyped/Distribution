package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableFromEventPatternObservableMod {
  
  @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class FromEventPatternObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object FromEventPatternObservable {
    
    @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](addHandler: js.Function1[/* handler */ js.Function, Any]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
    inline def create[T](
      addHandler: js.Function1[/* handler */ js.Function, Any],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[Any], Unit]
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T](
      addHandler: js.Function1[/* handler */ js.Function, Any],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[Any], Unit],
      selector: js.Function1[/* repeated */ Any, T]
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T](
      addHandler: js.Function1[/* handler */ js.Function, Any],
      removeHandler: Unit,
      selector: js.Function1[/* repeated */ Any, T]
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  }
}
