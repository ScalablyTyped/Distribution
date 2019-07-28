package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.SchedulerNs.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
object SchedulerNs extends js.Object {
  @js.native
  class Action () extends Scheduler {
    def setDuration(time: Double): Action = js.native
  }
  
  @js.native
  class Simple () extends Scheduler
  
  @js.native
  class Speed () extends Scheduler
  
}

