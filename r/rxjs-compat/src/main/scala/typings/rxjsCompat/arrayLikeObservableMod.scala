package typings.rxjsCompat

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayLikeObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/ArrayLikeObservable", "ArrayLikeObservable")
  @js.native
  open class ArrayLikeObservable[T] () extends StObject
  /* static members */
  object ArrayLikeObservable {
    
    @JSImport("rxjs-compat/observable/ArrayLikeObservable", "ArrayLikeObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](arrayLike: ArrayLike[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T](
      arrayLike: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(arrayLike.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
