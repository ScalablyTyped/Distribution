package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragStateChangedData extends js.Object {
  var draggedNode: TreeItem
  var isDragging: scala.Boolean
}

object OnDragStateChangedData {
  @scala.inline
  def apply(draggedNode: TreeItem, isDragging: scala.Boolean): OnDragStateChangedData = {
    val __obj = js.Dynamic.literal(draggedNode = draggedNode, isDragging = isDragging)
  
    __obj.asInstanceOf[OnDragStateChangedData]
  }
}

