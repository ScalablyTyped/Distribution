package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableArrayObservableMod {
  
  @JSImport("rxjs-compat/observable/ArrayObservable", "ArrayObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class ArrayObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object ArrayObservable {
    
    @JSImport("rxjs-compat/observable/ArrayObservable", "ArrayObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](array: js.Array[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
    inline def create[T](array: js.Array[T], scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  }
}
