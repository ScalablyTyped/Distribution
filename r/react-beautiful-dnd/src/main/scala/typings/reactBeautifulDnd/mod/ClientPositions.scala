package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPositions extends js.Object {
  // the current center of the item
  var borderBoxCenter: Position
  // how far the item has moved from its original position
  var offset: Position
  // where the user initially selected
  // This point is not used to calculate the impact of a dragging item
  // It is used to calculate the offset from the initial selection point
  var selection: Position
}

object ClientPositions {
  @scala.inline
  def apply(borderBoxCenter: Position, offset: Position, selection: Position): ClientPositions = {
    val __obj = js.Dynamic.literal(borderBoxCenter = borderBoxCenter.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPositions]
  }
}

