package typings.rxjs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/observable/TimerObservable", JSImport.Namespace)
@js.native
object timerObservableMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @js.native
  class TimerObservable[T] ()
    extends typings.rxjsCompat.timerObservableMod.TimerObservable[T]
  
  /* static members */
  @js.native
  object TimerObservable extends js.Object {
    def create(): js.Any = js.native
    def create(
      initialDelay: js.UndefOr[scala.Nothing],
      period: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(
      initialDelay: js.UndefOr[scala.Nothing],
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(
      initialDelay: js.UndefOr[scala.Nothing],
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(initialDelay: js.UndefOr[scala.Nothing], period: Double): js.Any = js.native
    def create(
      initialDelay: js.UndefOr[scala.Nothing],
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(initialDelay: Double): js.Any = js.native
    def create(
      initialDelay: Double,
      period: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(
      initialDelay: Double,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(
      initialDelay: Double,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(initialDelay: Double, period: Double): js.Any = js.native
    def create(
      initialDelay: Double,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(initialDelay: Date): js.Any = js.native
    def create(
      initialDelay: Date,
      period: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(
      initialDelay: Date,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(
      initialDelay: Date,
      period: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def create(initialDelay: Date, period: Double): js.Any = js.native
    def create(
      initialDelay: Date,
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
  
}

