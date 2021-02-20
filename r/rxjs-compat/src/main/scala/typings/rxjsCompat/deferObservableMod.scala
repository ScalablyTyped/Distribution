package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/DeferObservable", "DeferObservable")
  @js.native
  class DeferObservable[T] () extends StObject
  /* static members */
  object DeferObservable {
    
    @JSImport("rxjs-compat/observable/DeferObservable", "DeferObservable.create")
    @js.native
    def create[T](
      observableFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _) | Unit
        ]
    ): js.Any = js.native
  }
}
