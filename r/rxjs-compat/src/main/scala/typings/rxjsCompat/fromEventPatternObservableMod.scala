package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventPatternObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable")
  @js.native
  class FromEventPatternObservable[T] () extends StObject
  /* static members */
  object FromEventPatternObservable {
    
    @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable.create")
    @js.native
    def create[T](addHandler: js.Function1[/* handler */ js.Function, _]): js.Any = js.native
    @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable.create")
    @js.native
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, _],
      removeHandler: js.UndefOr[scala.Nothing],
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
    @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable.create")
    @js.native
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, _],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], Unit]
    ): js.Any = js.native
    @JSImport("rxjs-compat/observable/FromEventPatternObservable", "FromEventPatternObservable.create")
    @js.native
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, _],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], Unit],
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
  }
}
