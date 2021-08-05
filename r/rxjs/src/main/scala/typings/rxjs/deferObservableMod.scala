package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/DeferObservable", "DeferObservable")
  @js.native
  class DeferObservable[T] ()
    extends typings.rxjsCompat.deferObservableMod.DeferObservable[T]
  /* static members */
  object DeferObservable {
    
    @JSImport("rxjs/observable/DeferObservable", "DeferObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      observableFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any) | Unit
        ]
    ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
