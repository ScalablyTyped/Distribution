package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/ScalarObservable", JSImport.Namespace)
@js.native
object scalarObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class ScalarObservable[T] ()
    extends typings.rxjsCompat.scalarObservableMod.ScalarObservable[T]
  
  /* static members */
  @js.native
  object ScalarObservable extends js.Object {
    def create[T](value: T): js.Any = js.native
    def create[T](
      value: T,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

