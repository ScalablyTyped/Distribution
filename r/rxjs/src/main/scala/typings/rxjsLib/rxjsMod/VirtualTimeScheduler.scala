package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler {
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ]) = this()
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ], maxFrames: scala.Double) = this()
}

/* static members */
@JSImport("rxjs", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: scala.Double = js.native
}

