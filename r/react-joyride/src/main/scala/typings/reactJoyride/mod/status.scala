package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.error
import typings.reactJoyride.reactJoyrideStrings.finished
import typings.reactJoyride.reactJoyrideStrings.idle
import typings.reactJoyride.reactJoyrideStrings.paused
import typings.reactJoyride.reactJoyrideStrings.ready
import typings.reactJoyride.reactJoyrideStrings.running
import typings.reactJoyride.reactJoyrideStrings.skipped
import typings.reactJoyride.reactJoyrideStrings.waiting
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
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], FINISHED = FINISHED.asInstanceOf[js.Any], IDLE = IDLE.asInstanceOf[js.Any], PAUSED = PAUSED.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], SKIPPED = SKIPPED.asInstanceOf[js.Any], WAITING = WAITING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[status]
  }
}

