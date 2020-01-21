package typings.rxjs.mod

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends typings.rxjs.virtualTimeSchedulerMod.VirtualTimeScheduler {
  def this(SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ]) = this()
  def this(
    SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ],
    maxFrames: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: Double = js.native
}

