package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/IteratorObservable", "IteratorObservable")
  @js.native
  open class IteratorObservable[T] () extends StObject
  /* static members */
  object IteratorObservable {
    
    @JSImport("rxjs-compat/observable/IteratorObservable", "IteratorObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](iterable: js.Iterable[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(iterable.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T](
      iterable: js.Iterable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(iterable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
