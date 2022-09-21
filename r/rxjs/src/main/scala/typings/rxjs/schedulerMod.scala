package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.actionMod.Action
import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.internalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  @JSImport("rxjs/dist/types/internal/Scheduler", "Scheduler")
  @js.native
  open class Scheduler protected ()
    extends StObject
       with SchedulerLike {
    def this(schedulerActionCtor: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      schedulerActionCtor: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
    
    /**
      * Returns a timestamp as a number.
      *
      * This is used by types like `ReplaySubject` or operators like `timestamp` to calculate
      * the amount of time passed between events.
      */
    /* CompleteClass */
    override def now(): Double = js.native
    
    /* private */ var schedulerActionCtor: Any = js.native
  }
  /* static members */
  object Scheduler {
    
    @JSImport("rxjs/dist/types/internal/Scheduler", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
}
