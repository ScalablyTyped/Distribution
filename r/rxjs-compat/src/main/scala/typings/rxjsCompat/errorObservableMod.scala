package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/observable/ErrorObservable", JSImport.Namespace)
@js.native
object errorObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class ErrorObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object ErrorObservable extends js.Object {
    def create[T](error: js.Any): js.Any = js.native
    def create[T](
      error: js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

