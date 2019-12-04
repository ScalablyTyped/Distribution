package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/RangeObservable", JSImport.Namespace)
@js.native
object observableRangeObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class RangeObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object RangeObservable extends js.Object {
    def create(): js.Any = js.native
    def create(start: Double): js.Any = js.native
    def create(start: Double, count: Double): js.Any = js.native
    def create(
      start: Double,
      count: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

