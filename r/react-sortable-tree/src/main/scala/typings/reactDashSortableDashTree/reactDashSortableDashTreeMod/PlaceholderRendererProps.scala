package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderRendererProps extends js.Object {
  var canDrop: Boolean
  var draggedNode: TreeItem
  var isOver: Boolean
}

object PlaceholderRendererProps {
  @scala.inline
  def apply(canDrop: Boolean, draggedNode: TreeItem, isOver: Boolean): PlaceholderRendererProps = {
    val __obj = js.Dynamic.literal(canDrop = canDrop, draggedNode = draggedNode, isOver = isOver)
  
    __obj.asInstanceOf[PlaceholderRendererProps]
  }
}

