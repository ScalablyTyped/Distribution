package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.actionMod.Action
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  @JSImport("rxjs/internal/Scheduler", "Scheduler")
  @js.native
  class Scheduler protected ()
    extends StObject
       with SchedulerLike {
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
    
    var SchedulerAction: js.Any = js.native
  }
  /* static members */
  object Scheduler {
    
    @JSImport("rxjs/internal/Scheduler", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Note: the extra arrow function wrapper is to make testing by overriding
      * Date.now easier.
      * @nocollapse
      */
    @scala.inline
    def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
}
