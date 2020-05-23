package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.actionMod.Action
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.schedulerMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/AsyncScheduler", JSImport.Namespace)
@js.native
object asyncSchedulerMod extends js.Object {
  @js.native
  class AsyncScheduler protected () extends Scheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
    var actions: js.Array[AsyncAction[_]] = js.native
    /**
      * A flag to indicate whether the Scheduler is currently executing a batch of
      * queued actions.
      * @type {boolean}
      * @deprecated internal use only
      */
    var active: Boolean = js.native
    /**
      * An internal ID used to track the latest asynchronous task such as those
      * coming from `setTimeout`, `setInterval`, `requestAnimationFrame`, and
      * others.
      * @type {any}
      * @deprecated internal use only
      */
    var scheduled: js.Any = js.native
    def flush(action: AsyncAction[_]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object AsyncScheduler extends js.Object {
    var delegate: js.UndefOr[Scheduler] = js.native
  }
  
}

