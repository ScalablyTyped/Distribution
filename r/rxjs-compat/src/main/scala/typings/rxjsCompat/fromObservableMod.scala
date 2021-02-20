package typings.rxjsCompat

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/FromObservable", "FromObservable")
  @js.native
  class FromObservable[T] () extends StObject
  /* static members */
  object FromObservable {
    
    @JSImport("rxjs-compat/observable/FromObservable", "FromObservable.create")
    @js.native
    def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any = js.native
    @JSImport("rxjs-compat/observable/FromObservable", "FromObservable.create")
    @js.native
    def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSImport("rxjs-compat/observable/FromObservable", "FromObservable.create")
    @js.native
    def create[T, R](ish: ArrayLike[T]): js.Any = js.native
    @JSImport("rxjs-compat/observable/FromObservable", "FromObservable.create")
    @js.native
    def create[T, R](
      ish: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
