package typings
package rxjsLib.internalSchedulerVirtualTimeSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler {
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[js.Object], 
        /* state */ js.UndefOr[js.Object], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ]) = this()
  def this(SchedulerAction: org.scalablytyped.runtime.Instantiable2[
      /* scheduler */ rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler, 
      /* work */ js.ThisFunction1[
        /* this */ rxjsLib.internalTypesMod.SchedulerAction[js.Object], 
        /* state */ js.UndefOr[js.Object], 
        scala.Unit
      ], 
      rxjsLib.internalSchedulerAsyncActionMod.AsyncAction[js.Object]
    ], maxFrames: scala.Double) = this()
  var frame: scala.Double = js.native
  var index: scala.Double = js.native
  var maxFrames: scala.Double = js.native
  /**
       * Prompt the Scheduler to execute all of its queued actions, therefore
       * clearing its queue.
       * @return {void}
       */
  def flush(): scala.Unit = js.native
}

@JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: scala.Double = js.native
}

