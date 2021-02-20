package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.actionMod.Action
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.schedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncSchedulerMod {
  
  @JSImport("rxjs/internal/scheduler/AsyncScheduler", "AsyncScheduler")
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
    
    def flush(action: AsyncAction[_]): Unit = js.native
    
    /**
      * An internal ID used to track the latest asynchronous task such as those
      * coming from `setTimeout`, `setInterval`, `requestAnimationFrame`, and
      * others.
      * @type {any}
      * @deprecated internal use only
      */
    var scheduled: js.Any = js.native
  }
  /* static members */
  object AsyncScheduler {
    
    @JSImport("rxjs/internal/scheduler/AsyncScheduler", "AsyncScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/scheduler/AsyncScheduler", "AsyncScheduler.delegate")
    @js.native
    def delegate: js.UndefOr[Scheduler] = js.native
    @scala.inline
    def delegate_=(x: js.UndefOr[Scheduler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delegate")(x.asInstanceOf[js.Any])
  }
}
