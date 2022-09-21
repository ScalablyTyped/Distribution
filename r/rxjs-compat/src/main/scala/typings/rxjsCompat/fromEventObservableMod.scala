package typings.rxjsCompat

import typings.std.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/FromEventObservable", "FromEventObservable")
  @js.native
  open class FromEventObservable[T] () extends StObject
  /* static members */
  object FromEventObservable {
    
    @JSImport("rxjs-compat/observable/FromEventObservable", "FromEventObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String,
      options: EventListenerOptions
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String,
      options: EventListenerOptions,
      selector: js.Function1[/* repeated */ Any, T]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ Any,
      eventName: String,
      selector: js.Function1[/* repeated */ Any, T]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
