package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.distTypesInternalSchedulerActionMod.Action
import typings.rxjs.distTypesInternalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerAsapSchedulerMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AsapScheduler", "AsapScheduler")
  @js.native
  open class AsapScheduler protected () extends AsyncScheduler {
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
    
    def flush(): Unit = js.native
  }
}
