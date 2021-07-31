package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/PromiseObservable", "PromiseObservable")
  @js.native
  class PromiseObservable[T] ()
    extends typings.rxjsCompat.promiseObservableMod.PromiseObservable[T]
  /* static members */
  object PromiseObservable {
    
    @JSImport("rxjs/observable/PromiseObservable", "PromiseObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](promise: js.Thenable[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      promise: js.Thenable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
