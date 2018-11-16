package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "Scheduler")
@js.native
class Scheduler protected ()
  extends rxjsLib.internalSchedulerMod.Scheduler {
  def this(SchedulerAction: ScalablyTyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerMod.Scheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[js.Object], 
        /* state */ js.UndefOr[js.Object], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerActionMod.Action[js.Object]
    ]) = this()
  def this(SchedulerAction: ScalablyTyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerMod.Scheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[js.Object], 
        /* state */ js.UndefOr[js.Object], 
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

