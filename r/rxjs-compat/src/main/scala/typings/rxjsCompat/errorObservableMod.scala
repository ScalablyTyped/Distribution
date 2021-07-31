package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/ErrorObservable", "ErrorObservable")
  @js.native
  class ErrorObservable[T] () extends StObject
  /* static members */
  object ErrorObservable {
    
    @JSImport("rxjs-compat/observable/ErrorObservable", "ErrorObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](error: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(error.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      error: js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
