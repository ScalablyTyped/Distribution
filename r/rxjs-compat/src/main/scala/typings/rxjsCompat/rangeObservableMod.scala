package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/RangeObservable", "RangeObservable")
  @js.native
  class RangeObservable[T] () extends StObject
  /* static members */
  object RangeObservable {
    
    @JSImport("rxjs-compat/observable/RangeObservable", "RangeObservable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    @scala.inline
    def create(start: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create(start: Double, count: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create(
      start: Double,
      count: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create(
      start: Double,
      count: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create(start: Unit, count: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create(
      start: Unit,
      count: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def create(
      start: Unit,
      count: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
