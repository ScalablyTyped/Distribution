package typings.rxjs

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/FromObservable", "FromObservable")
  @js.native
  class FromObservable[T] ()
    extends typings.rxjsCompat.fromObservableMod.FromObservable[T]
  /* static members */
  object FromObservable {
    
    @JSImport("rxjs/observable/FromObservable", "FromObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](ish: ArrayLike[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T, R](
      ish: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
