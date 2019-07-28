package typings.rcDashTree.rcDashTreeMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRightClickData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnRightClickData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnRightClickData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnRightClickData]
  }
}

