package typings.rxjs

import typings.rxjs.animationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.typesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationFrameActionMod {
  
  @JSImport("rxjs/internal/scheduler/AnimationFrameAction", "AnimationFrameAction")
  @js.native
  class AnimationFrameAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AnimationFrameScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    @JSName("scheduler")
    var scheduler_AnimationFrameAction: AnimationFrameScheduler = js.native
  }
}
