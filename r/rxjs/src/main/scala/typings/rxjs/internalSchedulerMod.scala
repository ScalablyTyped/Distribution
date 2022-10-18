package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.distTypesInternalSchedulerActionMod.Action
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerMod {
  
  @JSImport("rxjs/internal/Scheduler", "Scheduler")
  @js.native
  open class Scheduler protected ()
    extends typings.rxjs.distTypesInternalSchedulerMod.Scheduler {
    def this(schedulerActionCtor: Instantiable2[
            /* scheduler */ typings.rxjs.distTypesInternalSchedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      schedulerActionCtor: Instantiable2[
            /* scheduler */ typings.rxjs.distTypesInternalSchedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
  }
  /* static members */
  object Scheduler {
    
    @JSImport("rxjs/internal/Scheduler", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
}
