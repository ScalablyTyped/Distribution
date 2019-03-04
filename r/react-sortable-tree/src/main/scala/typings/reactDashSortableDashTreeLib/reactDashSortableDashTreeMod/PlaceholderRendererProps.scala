package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderRendererProps extends js.Object {
  var canDrop: scala.Boolean
  var draggedNode: TreeItem
  var isOver: scala.Boolean
}

object PlaceholderRendererProps {
  @scala.inline
  def apply(canDrop: scala.Boolean, draggedNode: TreeItem, isOver: scala.Boolean): PlaceholderRendererProps = {
    val __obj = js.Dynamic.literal(canDrop = canDrop, draggedNode = draggedNode, isOver = isOver)
  
    __obj.asInstanceOf[PlaceholderRendererProps]
  }
}

