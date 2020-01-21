package typings.rxjsCompat

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/observable/IteratorObservable", JSImport.Namespace)
@js.native
object iteratorObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class IteratorObservable[T] () extends js.Object
  
  /* static members */
  @js.native
  object IteratorObservable extends js.Object {
    def create[T](iterable: Iterable[T]): js.Any = js.native
    def create[T](
      iterable: Iterable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

