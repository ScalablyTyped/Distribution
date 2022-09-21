package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/DeferObservable", "DeferObservable")
  @js.native
  open class DeferObservable[T] () extends StObject
  /* static members */
  object DeferObservable {
    
    @JSImport("rxjs-compat/observable/DeferObservable", "DeferObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      observableFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ Any) | Unit
        ]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
