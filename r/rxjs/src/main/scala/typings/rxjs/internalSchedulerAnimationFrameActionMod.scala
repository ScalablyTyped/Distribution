package typings.rxjs

import typings.rxjs.internalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AnimationFrameAction", JSImport.Namespace)
@js.native
object internalSchedulerAnimationFrameActionMod extends js.Object {
  @js.native
  class AnimationFrameAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AnimationFrameScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    @JSName("scheduler")
    var scheduler_AnimationFrameAction: AnimationFrameScheduler = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.Any, delay: Double): js.Any = js.native
  }
  
}

