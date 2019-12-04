package typings.rxjs

import typings.rxjs.internalSchedulerAsapSchedulerMod.AsapScheduler
import typings.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsapAction", JSImport.Namespace)
@js.native
object internalSchedulerAsapActionMod extends js.Object {
  @js.native
  class AsapAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    @JSName("scheduler")
    var scheduler_AsapAction: AsapScheduler = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
  }
  
}

