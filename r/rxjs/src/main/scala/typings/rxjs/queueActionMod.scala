package typings.rxjs

import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.queueSchedulerMod.QueueScheduler
import typings.rxjs.typesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueActionMod {
  
  @JSImport("rxjs/internal/scheduler/QueueAction", "QueueAction")
  @js.native
  class QueueAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: QueueScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def requestAsyncId(scheduler: QueueScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: Unit, delay: Double): js.Any = js.native
    
    @JSName("scheduler")
    var scheduler_QueueAction: QueueScheduler = js.native
  }
}
