package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairsObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/PairsObservable", "PairsObservable")
  @js.native
  class PairsObservable[T] () extends StObject
  /* static members */
  object PairsObservable {
    
    @JSImport("rxjs-compat/observable/PairsObservable", "PairsObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](obj: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create[T](
      obj: js.Object,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
