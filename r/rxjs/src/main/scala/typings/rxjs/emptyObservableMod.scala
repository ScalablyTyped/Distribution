package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/EmptyObservable", "EmptyObservable")
  @js.native
  class EmptyObservable[T] ()
    extends typings.rxjsCompat.emptyObservableMod.EmptyObservable[T]
  /* static members */
  object EmptyObservable {
    
    @JSImport("rxjs/observable/EmptyObservable", "EmptyObservable.create")
    @js.native
    def create[T](): js.Any = js.native
    @JSImport("rxjs/observable/EmptyObservable", "EmptyObservable.create")
    @js.native
    def create[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
