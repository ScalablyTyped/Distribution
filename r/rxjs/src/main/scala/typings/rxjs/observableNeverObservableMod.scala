package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/NeverObservable", JSImport.Namespace)
@js.native
object observableNeverObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class NeverObservable[T] ()
    extends typings.rxjsDashCompat.observableNeverObservableMod.NeverObservable[T]
  
  /* static members */
  @js.native
  object NeverObservable extends js.Object {
    def create[T](): js.Any = js.native
  }
  
}

