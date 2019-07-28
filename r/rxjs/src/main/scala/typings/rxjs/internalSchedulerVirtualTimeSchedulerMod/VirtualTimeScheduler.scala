package typings.rxjs.internalSchedulerVirtualTimeSchedulerMod

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler () extends AsyncScheduler {
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
  var frame: Double = js.native
  var index: Double = js.native
  var maxFrames: Double = js.native
  /**
    * Prompt the Scheduler to execute all of its queued actions, therefore
    * clearing its queue.
    * @return {void}
    */
  def flush(): Unit = js.native
}

/* static members */
@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: Double = js.native
}

