package typings.rxjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/TimerObservable", "TimerObservable")
  @js.native
  class TimerObservable[T] ()
    extends typings.rxjsCompat.timerObservableMod.TimerObservable[T]
  /* static members */
  object TimerObservable {
    
    @JSImport("rxjs/observable/TimerObservable", "TimerObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    inline def create(initialDelay: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Double,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Double,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(initialDelay: Double, period: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Double,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Double,
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Unit,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Unit,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(initialDelay: Unit, period: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Unit,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Unit,
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(initialDelay: Date): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Date,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Date,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(initialDelay: Date, period: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Date,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def create(
      initialDelay: Date,
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
