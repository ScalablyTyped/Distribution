package typings.rcTree.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRightClickData extends js.Object {
  var event: Event_
  var node: InternalTreeNode
}

object OnRightClickData {
  @scala.inline
  def apply(event: Event_, node: InternalTreeNode): OnRightClickData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnRightClickData]
  }
}

