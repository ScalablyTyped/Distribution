package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.DROP_PENDING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> ]: react-beautiful-dnd.react-beautiful-dnd.DraggingState[P]} */ trait DropPendingState extends State {
  var isWaiting: Boolean
  var phase: DROP_PENDING
  var reason: DropReason
}

object DropPendingState {
  @scala.inline
  def apply(isWaiting: Boolean, phase: DROP_PENDING, reason: DropReason): DropPendingState = {
    val __obj = js.Dynamic.literal(isWaiting = isWaiting.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropPendingState]
  }
}

