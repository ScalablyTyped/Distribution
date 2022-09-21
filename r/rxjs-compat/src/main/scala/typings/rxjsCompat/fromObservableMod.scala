package typings.rxjsCompat

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/FromObservable", "FromObservable")
  @js.native
  open class FromObservable[T] () extends StObject
  /* static members */
  object FromObservable {
    
    @JSImport("rxjs-compat/observable/FromObservable", "FromObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T](
      ish: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T, R](ish: ArrayLike[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T, R](
      ish: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
