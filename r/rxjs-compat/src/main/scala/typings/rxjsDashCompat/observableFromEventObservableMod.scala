package typings.rxjsDashCompat

import typings.std.EventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/FromEventObservable", JSImport.Namespace)
@js.native
object observableFromEventObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class FromEventObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object FromEventObservable extends js.Object {
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String
    ): js.Any = js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      options: EventListenerOptions
    ): js.Any = js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      options: EventListenerOptions,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
  }
  
}

