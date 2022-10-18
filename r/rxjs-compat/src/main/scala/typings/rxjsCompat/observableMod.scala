package typings.rxjsCompat

import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("rxjs-compat/Observable", "Observable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class Observable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[
            /* this */ typings.rxjs.distTypesInternalObservableMod.Observable[T], 
            /* subscriber */ Subscriber[T], 
            TeardownLogic
          ]) = this()
  }
  /* static members */
  object Observable {
    
    @JSImport("rxjs-compat/Observable", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Observable by calling the Observable constructor
      * @owner Observable
      * @method create
      * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
      * @return {Observable} a new observable
      * @nocollapse
      * @deprecated Use `new Observable()` instead. Will be removed in v8.
      */
    inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
}
