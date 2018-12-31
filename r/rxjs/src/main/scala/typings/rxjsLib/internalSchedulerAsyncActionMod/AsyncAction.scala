package typings
package rxjsLib.internalSchedulerAsyncActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsyncAction", "AsyncAction")
@js.native
class AsyncAction[T] protected ()
  extends rxjsLib.internalSchedulerActionMod.Action[T] {
  def this(scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, work: js.ThisFunction1[
      /* this */ rxjsLib.internalTypesMod.SchedulerAction[T], 
      /* state */ js.UndefOr[T], 
      scala.Unit
    ]) = this()
  var delay: scala.Double = js.native
  var id: js.Any = js.native
  var pending: scala.Boolean = js.native
  var scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler = js.native
  var state: T = js.native
  /* protected */ def _execute(state: T, delay: scala.Double): js.Any = js.native
  /** @deprecated This is an internal implementation detail, do not use. */
  def _unsubscribe(): scala.Unit = js.native
  /**
    * Immediately executes this action and the `work` it contains.
    * @return {any}
    */
  def execute(state: T, delay: scala.Double): js.Any = js.native
  /* protected */ def recycleAsyncId(scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, id: js.Any): js.Any = js.native
  /* protected */ def recycleAsyncId(
    scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler,
    id: js.Any,
    delay: scala.Double
  ): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, id: js.Any): js.Any = js.native
  /* protected */ def requestAsyncId(
    scheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler,
    id: js.Any,
    delay: scala.Double
  ): js.Any = js.native
  /* protected */ def work(`this`: rxjsLib.internalTypesMod.SchedulerAction[T]): scala.Unit = js.native
  /* protected */ def work(`this`: rxjsLib.internalTypesMod.SchedulerAction[T], state: T): scala.Unit = js.native
}

