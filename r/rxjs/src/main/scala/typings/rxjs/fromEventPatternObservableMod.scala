package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventPatternObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/FromEventPatternObservable", "FromEventPatternObservable")
  @js.native
  class FromEventPatternObservable[T] ()
    extends typings.rxjsCompat.fromEventPatternObservableMod.FromEventPatternObservable[T]
  /* static members */
  object FromEventPatternObservable {
    
    @JSImport("rxjs/observable/FromEventPatternObservable", "FromEventPatternObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](addHandler: js.Function1[/* handler */ js.Function, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, js.Any],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], Unit]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, js.Any],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], Unit],
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, js.Any],
      removeHandler: Unit,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
