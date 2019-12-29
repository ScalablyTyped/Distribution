package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.internalSchedulerActionMod.Action
import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Scheduler", JSImport.Namespace)
@js.native
object internalSchedulerMod extends js.Object {
  @js.native
  class Scheduler protected () extends SchedulerLike {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
    var SchedulerAction: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Scheduler extends js.Object {
    /**
      * Note: the extra arrow function wrapper is to make testing by overriding
      * Date.now easier.
      * @nocollapse
      */
    def now(): Double = js.native
  }
  
}

