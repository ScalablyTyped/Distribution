package typings.rcTree.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragOverData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnDragOverData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnDragOverData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragOverData]
  }
}

