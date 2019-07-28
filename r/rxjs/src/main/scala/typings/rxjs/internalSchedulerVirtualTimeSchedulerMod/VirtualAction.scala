package typings.rxjs.internalSchedulerVirtualTimeSchedulerMod

import typings.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.rxjsNumbers.`-1`
import typings.rxjs.rxjsNumbers.`0`
import typings.rxjs.rxjsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
@js.native
class VirtualAction[T] protected () extends AsyncAction[T] {
  def this(
    scheduler: VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
  ) = this()
  def this(
    scheduler: VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    index: Double
  ) = this()
  var active: Boolean = js.native
  var index: Double = js.native
  @JSName("scheduler")
  var scheduler_VirtualAction: VirtualTimeScheduler = js.native
  /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
  /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
  /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
}

/* static members */
@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](a: VirtualAction[T], b: VirtualAction[T]): `1` | `0` | `-1` = js.native
}

