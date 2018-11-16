package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
object SchedulerNs extends js.Object {
  @js.native
  class Action ()
    extends rotDashJsLib.rotDashJsMod.Scheduler {
    def setDuration(time: scala.Double): Action = js.native
  }
  
  @js.native
  class Simple ()
    extends rotDashJsLib.rotDashJsMod.Scheduler
  
  @js.native
  class Speed ()
    extends rotDashJsLib.rotDashJsMod.Scheduler
  
}

