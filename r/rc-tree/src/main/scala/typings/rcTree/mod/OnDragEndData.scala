package typings.rcTree.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEndData extends js.Object {
  var event: Event_
  var node: InternalTreeNode
}

object OnDragEndData {
  @scala.inline
  def apply(event: Event_, node: InternalTreeNode): OnDragEndData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragEndData]
  }
}

