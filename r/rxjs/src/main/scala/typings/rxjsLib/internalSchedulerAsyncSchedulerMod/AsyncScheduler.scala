package typings
package rxjsLib.internalSchedulerAsyncSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsyncScheduler", "AsyncScheduler")
@js.native
class AsyncScheduler protected ()
  extends rxjsLib.internalSchedulerMod.Scheduler {
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerMod.Scheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerActionMod.Action[js.Object]
    ]) = this()
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerMod.Scheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerActionMod.Action[js.Object]
    ], now: js.Function0[scala.Double]) = this()
  var actions: js.Array[rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[_]] = js.native
  /**
    * A flag to indicate whether the Scheduler is currently executing a batch of
    * queued actions.
    * @type {boolean}
    * @deprecated internal use only
    */
  var active: scala.Boolean = js.native
  /**
    * An internal ID used to track the latest asynchronous task such as those
    * coming from `setTimeout`, `setInterval`, `requestAnimationFrame`, and
    * others.
    * @type {any}
    * @deprecated internal use only
    */
  var scheduled: js.Any = js.native
  def flush(action: rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[_]): scala.Unit = js.native
}

@JSImport("rxjs/internal/scheduler/AsyncScheduler", "AsyncScheduler")
@js.native
object AsyncScheduler extends js.Object {
  var delegate: js.UndefOr[rxjsLib.internalSchedulerMod.Scheduler] = js.native
}

