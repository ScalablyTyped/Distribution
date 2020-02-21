package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Displacement extends js.Object {
  var draggableId: DraggableId
  var shouldAnimate: Boolean
}

object Displacement {
  @scala.inline
  def apply(draggableId: DraggableId, shouldAnimate: Boolean): Displacement = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Displacement]
  }
}

