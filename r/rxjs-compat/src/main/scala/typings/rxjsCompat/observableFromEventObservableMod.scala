package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import typings.std.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableFromEventObservableMod {
  
  @JSImport("rxjs-compat/observable/FromEventObservable", "FromEventObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class FromEventObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object FromEventObservable {
    
    @JSImport("rxjs-compat/observable/FromEventObservable", "FromEventObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String,
      options: EventListenerOptions
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String,
      options: EventListenerOptions,
      selector: js.Function1[/* repeated */ Any, T]
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String,
      selector: js.Function1[/* repeated */ Any, T]
    ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  }
}
