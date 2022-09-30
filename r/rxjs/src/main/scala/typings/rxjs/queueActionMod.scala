package typings.rxjs

import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.queueSchedulerMod.QueueScheduler
import typings.rxjs.timerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/QueueAction", "QueueAction")
  @js.native
  open class QueueAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: QueueScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def requestAsyncId(scheduler: QueueScheduler): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: Unit, delay: Double): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: TimerHandle): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: TimerHandle, delay: Double): TimerHandle = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_QueueAction: QueueScheduler = js.native
  }
}
