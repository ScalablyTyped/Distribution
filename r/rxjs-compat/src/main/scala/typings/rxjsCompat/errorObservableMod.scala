package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/ErrorObservable", "ErrorObservable")
  @js.native
  open class ErrorObservable[T] () extends StObject
  /* static members */
  object ErrorObservable {
    
    @JSImport("rxjs-compat/observable/ErrorObservable", "ErrorObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](error: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(error.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T](
      error: Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(error.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
