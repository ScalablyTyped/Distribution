package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.distTypesInternalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerAnimationFrameActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AnimationFrameAction", "AnimationFrameAction")
  @js.native
  open class AnimationFrameAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AnimationFrameScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: Unit, delay: Double): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: TimerHandle): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: TimerHandle, delay: Double): js.UndefOr[TimerHandle] = js.native
    
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: Unit, delay: Double): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: TimerHandle): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: TimerHandle, delay: Double): TimerHandle = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_AnimationFrameAction: AnimationFrameScheduler = js.native
  }
}
