package typings.reactDashJoyride.reactDashJoyrideMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashJoyride.reactDashJoyrideStrings.error
import typings.reactDashJoyride.reactDashJoyrideStrings.finished
import typings.reactDashJoyride.reactDashJoyrideStrings.idle
import typings.reactDashJoyride.reactDashJoyrideStrings.paused
import typings.reactDashJoyride.reactDashJoyrideStrings.ready
import typings.reactDashJoyride.reactDashJoyrideStrings.running
import typings.reactDashJoyride.reactDashJoyrideStrings.skipped
import typings.reactDashJoyride.reactDashJoyrideStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait status extends js.Object {
  var ERROR: error
  var FINISHED: finished
  var IDLE: idle
  var PAUSED: paused
  var READY: ready
  var RUNNING: running
  var SKIPPED: skipped
  var WAITING: waiting
}

@JSImport("react-joyride", "STATUS")
@js.native
object STATUS extends TopLevel[status]

object status {
  @scala.inline
  def apply(
    ERROR: error,
    FINISHED: finished,
    IDLE: idle,
    PAUSED: paused,
    READY: ready,
    RUNNING: running,
    SKIPPED: skipped,
    WAITING: waiting
  ): status = {
    val __obj = js.Dynamic.literal(ERROR = ERROR, FINISHED = FINISHED, IDLE = IDLE, PAUSED = PAUSED, READY = READY, RUNNING = RUNNING, SKIPPED = SKIPPED, WAITING = WAITING)
  
    __obj.asInstanceOf[status]
  }
}

