package typings.rcDashTree.rcDashTreeMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragStartData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnDragStartData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnDragStartData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnDragStartData]
  }
}

