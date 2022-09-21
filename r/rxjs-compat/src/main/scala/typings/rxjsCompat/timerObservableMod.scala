package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/TimerObservable", "TimerObservable")
  @js.native
  open class TimerObservable[T] () extends StObject
  /* static members */
  object TimerObservable {
    
    @JSImport("rxjs-compat/observable/TimerObservable", "TimerObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
    inline def create(initialDelay: js.Date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(
      initialDelay: js.Date,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: js.Date,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(initialDelay: js.Date, period: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: js.Date,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: js.Date,
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(initialDelay: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(
      initialDelay: Double,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Double,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(initialDelay: Double, period: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Double,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Double,
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Unit,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Unit,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(initialDelay: Unit, period: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Unit,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def create(
      initialDelay: Unit,
      period: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialDelay.asInstanceOf[js.Any], period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
