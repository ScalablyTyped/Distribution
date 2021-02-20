package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/ErrorObservable", "ErrorObservable")
  @js.native
  class ErrorObservable[T] ()
    extends typings.rxjsCompat.errorObservableMod.ErrorObservable[T]
  /* static members */
  object ErrorObservable {
    
    @JSImport("rxjs/observable/ErrorObservable", "ErrorObservable.create")
    @js.native
    def create[T](error: js.Any): js.Any = js.native
    @JSImport("rxjs/observable/ErrorObservable", "ErrorObservable.create")
    @js.native
    def create[T](
      error: js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
