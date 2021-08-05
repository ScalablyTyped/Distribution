package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/ArrayObservable", "ArrayObservable")
  @js.native
  class ArrayObservable[T] ()
    extends typings.rxjsCompat.arrayObservableMod.ArrayObservable[T]
  /* static members */
  object ArrayObservable {
    
    @JSImport("rxjs/observable/ArrayObservable", "ArrayObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](array: js.Array[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create[T](
      array: js.Array[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
