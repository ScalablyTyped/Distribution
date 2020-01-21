package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/PairsObservable", JSImport.Namespace)
@js.native
object pairsObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class PairsObservable[T] ()
    extends typings.rxjsCompat.pairsObservableMod.PairsObservable[T]
  
  /* static members */
  @js.native
  object PairsObservable extends js.Object {
    def create[T](obj: js.Object): js.Any = js.native
    def create[T](
      obj: js.Object,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

