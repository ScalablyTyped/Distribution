package typings.rxjsDashCompat.rxjsDashCompatMod

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends typings.rxjs.rxjsMod.VirtualTimeScheduler {
  def this(SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ]) = this()
  def this(
    SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ],
    maxFrames: Double
  ) = this()
}

/* static members */
@JSImport("rxjs-compat", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: Double = js.native
}

