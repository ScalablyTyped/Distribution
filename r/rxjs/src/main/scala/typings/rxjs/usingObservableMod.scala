package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/observable/UsingObservable", JSImport.Namespace)
@js.native
object usingObservableMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class UsingObservable[T] ()
    extends typings.rxjsCompat.usingObservableMod.UsingObservable[T]
  /* static members */
  @js.native
  object UsingObservable extends js.Object {
    
    def create[T](
      resourceFactory: js.Function0[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Unsubscribable */ _) | Unit
        ],
      observableFactory: js.Function1[
          /* resource */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Unsubscribable */ js.Any) | Unit, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ _) | Unit
        ]
    ): js.Any = js.native
  }
}
