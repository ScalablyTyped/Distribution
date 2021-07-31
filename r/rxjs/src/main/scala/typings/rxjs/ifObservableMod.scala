package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/IfObservable", "IfObservable")
  @js.native
  class IfObservable[T] ()
    extends typings.rxjsCompat.ifObservableMod.IfObservable[T]
  /* static members */
  object IfObservable {
    
    @JSImport("rxjs/observable/IfObservable", "IfObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T, R](condition: js.Function0[Boolean | Unit]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      elseSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<R> */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<T> */ js.Any,
      elseSource: Unit
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](
      condition: js.Function0[Boolean | Unit],
      thenSource: Unit,
      elseSource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<R> */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](condition: js.Function0[Boolean | Unit], thenSource: Unit, elseSource: Unit): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(condition.asInstanceOf[js.Any], thenSource.asInstanceOf[js.Any], elseSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
