package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COLLECTING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> ]: react-beautiful-dnd.react-beautiful-dnd.DraggingState[P]} */ trait CollectingState
  extends State
     with StateWhenUpdatesAllowed {
  var phase: COLLECTING
}

object CollectingState {
  @scala.inline
  def apply(phase: COLLECTING): CollectingState = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectingState]
  }
}

