package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/ArrayObservable", JSImport.Namespace)
@js.native
object observableArrayObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class ArrayObservable[T] ()
    extends typings.rxjsDashCompat.observableArrayObservableMod.ArrayObservable[T]
  
  /* static members */
  @js.native
  object ArrayObservable extends js.Object {
    def create[T](array: js.Array[T]): js.Any = js.native
    def create[T](
      array: js.Array[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

