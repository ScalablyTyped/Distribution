package typings.rcTree.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseLeaveData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnMouseLeaveData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnMouseLeaveData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseLeaveData]
  }
}

