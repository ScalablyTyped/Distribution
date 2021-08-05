package typings.rxjs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayLikeObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/ArrayLikeObservable", "ArrayLikeObservable")
  @js.native
  class ArrayLikeObservable[T] ()
    extends typings.rxjsCompat.arrayLikeObservableMod.ArrayLikeObservable[T]
  /* static members */
  object ArrayLikeObservable {
    
    @JSImport("rxjs/observable/ArrayLikeObservable", "ArrayLikeObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](arrayLike: ArrayLike[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create[T](
      arrayLike: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(arrayLike.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
