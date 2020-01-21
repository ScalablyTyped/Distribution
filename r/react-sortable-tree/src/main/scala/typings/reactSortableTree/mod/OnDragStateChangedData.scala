package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragStateChangedData extends js.Object {
  var draggedNode: TreeItem
  var isDragging: Boolean
}

object OnDragStateChangedData {
  @scala.inline
  def apply(draggedNode: TreeItem, isDragging: Boolean): OnDragStateChangedData = {
    val __obj = js.Dynamic.literal(draggedNode = draggedNode.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnDragStateChangedData]
  }
}

