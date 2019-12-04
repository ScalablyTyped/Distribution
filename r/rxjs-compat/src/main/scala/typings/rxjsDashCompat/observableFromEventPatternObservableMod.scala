package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/FromEventPatternObservable", JSImport.Namespace)
@js.native
object observableFromEventPatternObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class FromEventPatternObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object FromEventPatternObservable extends js.Object {
    def create[T](addHandler: js.Function1[/* handler */ js.Function, _]): js.Any = js.native
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, _],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], Unit]
    ): js.Any = js.native
    def create[T](
      addHandler: js.Function1[/* handler */ js.Function, _],
      removeHandler: js.Function2[/* handler */ js.Function, /* signal */ js.UndefOr[js.Any], Unit],
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
  }
  
}

