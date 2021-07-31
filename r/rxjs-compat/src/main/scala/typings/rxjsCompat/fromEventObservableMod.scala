package typings.rxjsCompat

import typings.std.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/FromEventObservable", "FromEventObservable")
  @js.native
  class FromEventObservable[T] () extends StObject
  /* static members */
  object FromEventObservable {
    
    @JSImport("rxjs-compat/observable/FromEventObservable", "FromEventObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      options: EventListenerOptions
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      options: EventListenerOptions,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
