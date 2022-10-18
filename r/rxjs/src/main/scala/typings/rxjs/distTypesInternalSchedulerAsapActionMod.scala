package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerAsapSchedulerMod.AsapScheduler
import typings.rxjs.distTypesInternalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerAsapActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AsapAction", "AsapAction")
  @js.native
  open class AsapAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: Unit, delay: Double): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: TimerHandle): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: TimerHandle, delay: Double): js.UndefOr[TimerHandle] = js.native
    
    /* protected */ def requestAsyncId(scheduler: AsapScheduler): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: Unit, delay: Double): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: TimerHandle): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: TimerHandle, delay: Double): TimerHandle = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_AsapAction: AsapScheduler = js.native
  }
}
