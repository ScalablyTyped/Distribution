package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.distTypesInternalSchedulerActionMod.Action
import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerQueueSchedulerMod {
  
  @JSImport("rxjs/internal/scheduler/QueueScheduler", "QueueScheduler")
  @js.native
  open class QueueScheduler protected ()
    extends typings.rxjs.distTypesInternalSchedulerQueueSchedulerMod.QueueScheduler {
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
  }
}
