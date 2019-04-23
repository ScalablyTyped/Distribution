package typings
package rxjsLib.internalSchedulerVirtualTimeSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[T] {
  def this(scheduler: VirtualTimeScheduler, work: js.ThisFunction1[
      /* this */ rxjsLib.internalTypesMod.SchedulerAction[T], 
      /* state */ js.UndefOr[T], 
      scala.Unit
    ]) = this()
  def this(scheduler: VirtualTimeScheduler, work: js.ThisFunction1[
      /* this */ rxjsLib.internalTypesMod.SchedulerAction[T], 
      /* state */ js.UndefOr[T], 
      scala.Unit
    ], index: scala.Double) = this()
  var active: scala.Boolean = js.native
  var index: scala.Double = js.native
  @JSName("scheduler")
  var scheduler_VirtualAction: VirtualTimeScheduler = js.native
  /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
  /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
  /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: scala.Double): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
  /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: scala.Double): js.Any = js.native
}

/* static members */
@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T],
    b: rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T]
  ): rxjsLib.rxjsLibNumbers.`1` | rxjsLib.rxjsLibNumbers.`0` | rxjsLib.rxjsLibNumbers.`-1` = js.native
}

