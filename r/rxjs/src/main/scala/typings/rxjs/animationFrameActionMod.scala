package typings.rxjs

import typings.rxjs.animationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.internalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationFrameActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AnimationFrameAction", "AnimationFrameAction")
  @js.native
  open class AnimationFrameAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AnimationFrameScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler): Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: Any): Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: Any, delay: Double): Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: Unit, delay: Double): Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: Any): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: Any, delay: Double): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: Unit, delay: Double): Any = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_AnimationFrameAction: AnimationFrameScheduler = js.native
  }
}
