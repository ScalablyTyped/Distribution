package typings.rxjs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/observable/ArrayLikeObservable", JSImport.Namespace)
@js.native
object observableArrayLikeObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class ArrayLikeObservable[T] ()
    extends typings.rxjsDashCompat.observableArrayLikeObservableMod.ArrayLikeObservable[T]
  
  /* static members */
  @js.native
  object ArrayLikeObservable extends js.Object {
    def create[T](arrayLike: ArrayLike[T]): js.Any = js.native
    def create[T](
      arrayLike: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

