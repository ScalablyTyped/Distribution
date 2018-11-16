package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends rxjsLib.rxjsMod.VirtualTimeScheduler {
  def this(SchedulerAction: ScalablyTyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[js.Object], 
        /* state */ js.UndefOr[js.Object], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ]) = this()
  def this(SchedulerAction: ScalablyTyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[js.Object], 
        /* state */ js.UndefOr[js.Object], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ], maxFrames: scala.Double) = this()
}

@JSImport("rxjs-compat", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: scala.Double = js.native
}

