package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "Scheduler")
@js.native
class Scheduler protected ()
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
}

@JSImport("rxjs", "Scheduler")
@js.native
object Scheduler extends js.Object {
  /**
    * Note: the extra arrow function wrapper is to make testing by overriding
    * Date.now easier.
    * @nocollapse
    */
  def now(): scala.Double = js.native
}

