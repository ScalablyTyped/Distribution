package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.DROP_ANIMATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropAnimatingState extends State {
  var completed: CompletedDrag
  // We still need to render placeholders and fix the dimensions of the dragging item
  var dimensions: DimensionMap
  var dropDuration: Double
  var newHomeClientOffset: Position
  var phase: DROP_ANIMATING
}

object DropAnimatingState {
  @scala.inline
  def apply(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position,
    phase: DROP_ANIMATING
  ): DropAnimatingState = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimatingState]
  }
}

