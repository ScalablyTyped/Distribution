package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleState extends State {
  var completed: js.UndefOr[CompletedDrag] = js.undefined
  var phase: IDLE
  var shouldFlush: Boolean
}

object IdleState {
  @scala.inline
  def apply(phase: IDLE, shouldFlush: Boolean, completed: CompletedDrag = null): IdleState = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], shouldFlush = shouldFlush.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleState]
  }
}

