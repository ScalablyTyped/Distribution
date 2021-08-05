package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neverObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/NeverObservable", "NeverObservable")
  @js.native
  class NeverObservable[T] () extends StObject
  /* static members */
  object NeverObservable {
    
    @JSImport("rxjs-compat/observable/NeverObservable", "NeverObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  }
}
