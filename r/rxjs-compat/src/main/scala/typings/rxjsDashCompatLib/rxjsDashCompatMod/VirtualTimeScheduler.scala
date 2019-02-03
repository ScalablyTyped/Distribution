package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends rxjsLib.rxjsMod.VirtualTimeScheduler {
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ]) = this()
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ], maxFrames: scala.Double) = this()
}

/* static members */
@JSImport("rxjs-compat", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: scala.Double = js.native
}

