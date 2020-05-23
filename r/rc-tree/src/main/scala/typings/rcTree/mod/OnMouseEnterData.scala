package typings.rcTree.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseEnterData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnMouseEnterData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnMouseEnterData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseEnterData]
  }
}

