package typings.reactSortableTree.mod

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
    val __obj = js.Dynamic.literal(canDrop = canDrop.asInstanceOf[js.Any], draggedNode = draggedNode.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaceholderRendererProps]
  }
}

