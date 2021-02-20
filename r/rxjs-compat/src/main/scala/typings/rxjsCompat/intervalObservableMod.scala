package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/IntervalObservable", "IntervalObservable")
  @js.native
  class IntervalObservable[T] () extends StObject
  /* static members */
  object IntervalObservable {
    
    @JSImport("rxjs-compat/observable/IntervalObservable", "IntervalObservable.create")
    @js.native
    def create(): js.Any = js.native
    @JSImport("rxjs-compat/observable/IntervalObservable", "IntervalObservable.create")
    @js.native
    def create(
      period: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSImport("rxjs-compat/observable/IntervalObservable", "IntervalObservable.create")
    @js.native
    def create(period: Double): js.Any = js.native
    @JSImport("rxjs-compat/observable/IntervalObservable", "IntervalObservable.create")
    @js.native
    def create(
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
