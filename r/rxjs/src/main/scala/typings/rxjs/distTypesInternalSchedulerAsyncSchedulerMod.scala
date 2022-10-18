package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.distTypesInternalSchedulerActionMod.Action
import typings.rxjs.distTypesInternalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerAsyncSchedulerMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AsyncScheduler", "AsyncScheduler")
  @js.native
  open class AsyncScheduler protected () extends Scheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.distTypesInternalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.distTypesInternalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
    
    var actions: js.Array[AsyncAction[Any]] = js.native
    
    def flush(action: AsyncAction[Any]): Unit = js.native
  }
}
