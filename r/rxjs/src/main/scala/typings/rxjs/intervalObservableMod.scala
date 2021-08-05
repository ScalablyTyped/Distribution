package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/IntervalObservable", "IntervalObservable")
  @js.native
  class IntervalObservable[T] ()
    extends typings.rxjsCompat.intervalObservableMod.IntervalObservable[T]
  /* static members */
  object IntervalObservable {
    
    @JSImport("rxjs/observable/IntervalObservable", "IntervalObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    inline def create(period: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(period.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create(
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
