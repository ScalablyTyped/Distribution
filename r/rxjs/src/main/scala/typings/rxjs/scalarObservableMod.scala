package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalarObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/ScalarObservable", "ScalarObservable")
  @js.native
  class ScalarObservable[T] ()
    extends typings.rxjsCompat.scalarObservableMod.ScalarObservable[T]
  /* static members */
  object ScalarObservable {
    
    @JSImport("rxjs/observable/ScalarObservable", "ScalarObservable.create")
    @js.native
    def create[T](value: T): js.Any = js.native
    @JSImport("rxjs/observable/ScalarObservable", "ScalarObservable.create")
    @js.native
    def create[T](
      value: T,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
