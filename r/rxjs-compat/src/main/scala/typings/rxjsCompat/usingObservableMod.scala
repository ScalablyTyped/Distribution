package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usingObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/UsingObservable", "UsingObservable")
  @js.native
  class UsingObservable[T] () extends StObject
  /* static members */
  object UsingObservable {
    
    @JSImport("rxjs-compat/observable/UsingObservable", "UsingObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](
      resourceFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Unsubscribable */ js.Any) | Unit
        ],
      observableFactory: js.Function1[
          /* resource */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Unsubscribable */ js.Any) | Unit, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any) | Unit
        ]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
