package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/PromiseObservable", "PromiseObservable")
  @js.native
  class PromiseObservable[T] () extends StObject
  /* static members */
  object PromiseObservable {
    
    @JSImport("rxjs-compat/observable/PromiseObservable", "PromiseObservable.create")
    @js.native
    def create[T](promise: js.Thenable[T]): js.Any = js.native
    @JSImport("rxjs-compat/observable/PromiseObservable", "PromiseObservable.create")
    @js.native
    def create[T](
      promise: js.Thenable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
