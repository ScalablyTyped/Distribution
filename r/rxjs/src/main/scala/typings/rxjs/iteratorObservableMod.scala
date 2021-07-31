package typings.rxjs

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/IteratorObservable", "IteratorObservable")
  @js.native
  class IteratorObservable[T] ()
    extends typings.rxjsCompat.iteratorObservableMod.IteratorObservable[T]
  /* static members */
  object IteratorObservable {
    
    @JSImport("rxjs/observable/IteratorObservable", "IteratorObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create[T](iterable: Iterable[T]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create[T](
      iterable: Iterable[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(iterable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
