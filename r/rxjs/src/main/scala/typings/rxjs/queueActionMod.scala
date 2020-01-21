package typings.rxjs

import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.queueSchedulerMod.QueueScheduler
import typings.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/QueueAction", JSImport.Namespace)
@js.native
object queueActionMod extends js.Object {
  @js.native
  class QueueAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: QueueScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    @JSName("scheduler")
    var scheduler_QueueAction: QueueScheduler = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: QueueScheduler, id: js.Any, delay: Double): js.Any = js.native
  }
  
}

