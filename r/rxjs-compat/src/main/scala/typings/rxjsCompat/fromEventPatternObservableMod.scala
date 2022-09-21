package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventPatternObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable")
  @js.native
  open class FromEventPatternObservable[T] () extends StObject
  /* static members */
  object FromEventPatternObservable {
    
    @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](addHandler: js.Function1[/* handler */ js.Function, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create[T](
      addHandler: js.Function1[/* handler */ js.Function, Any],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[Any], Unit]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T](
      addHandler: js.Function1[/* handler */ js.Function, Any],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[Any], Unit],
      selector: js.Function1[/* repeated */ Any, T]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create[T](
      addHandler: js.Function1[/* handler */ js.Function, Any],
      removeHandler: Unit,
      selector: js.Function1[/* repeated */ Any, T]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
