package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/observable/IfObservable", JSImport.Namespace)
@js.native
object ifObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class IfObservable[T] ()
    extends typings.rxjsCompat.ifObservableMod.IfObservable[T]
  
  /* static members */
  @js.native
  object IfObservable extends js.Object {
    def create[T, R](condition: js.Function0[Boolean | Unit]): js.Any = js.native
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: js.UndefOr[scala.Nothing],
      elseSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<R> */ js.Any
    ): js.Any = js.native
    def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: js.UndefOr[scala.Nothing], elseSource: Unit): js.Any = js.native
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any
    ): js.Any = js.native
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      elseSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<R> */ js.Any
    ): js.Any = js.native
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      elseSource: Unit
    ): js.Any = js.native
    def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit): js.Any = js.native
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: Unit,
      elseSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<R> */ js.Any
    ): js.Any = js.native
    def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit, elseSource: Unit): js.Any = js.native
  }
  
}

