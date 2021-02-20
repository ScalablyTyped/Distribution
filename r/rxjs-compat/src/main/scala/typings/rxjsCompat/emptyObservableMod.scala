package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/EmptyObservable", "EmptyObservable")
  @js.native
  class EmptyObservable[T] () extends StObject
  /* static members */
  object EmptyObservable {
    
    @JSImport("rxjs-compat/observable/EmptyObservable", "EmptyObservable.create")
    @js.native
    def create[T](): js.Any = js.native
    @JSImport("rxjs-compat/observable/EmptyObservable", "EmptyObservable.create")
    @js.native
    def create[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
