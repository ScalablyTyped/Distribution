package typings.rxjs

import typings.rxjs.asapSchedulerMod.AsapScheduler
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsapAction", JSImport.Namespace)
@js.native
object asapActionMod extends js.Object {
  @js.native
  class AsapAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    @JSName("scheduler")
    var scheduler_AsapAction: AsapScheduler = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
  }
  
}

