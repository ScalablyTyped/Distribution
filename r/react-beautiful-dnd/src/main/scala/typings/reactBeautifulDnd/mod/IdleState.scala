package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleState extends State {
  var completed: js.UndefOr[CompletedDrag] = js.native
  var phase: IDLE = js.native
  var shouldFlush: Boolean = js.native
}

object IdleState {
  @scala.inline
  def apply(phase: IDLE, shouldFlush: Boolean): IdleState = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleState]
  }
  @scala.inline
  implicit class IdleStateOps[Self <: IdleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPhase(value: IDLE): Self = this.set("phase", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldFlush(value: Boolean): Self = this.set("shouldFlush", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted(value: CompletedDrag): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
  }
  
}

