package typings.rcDashTree.rcDashTreeMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragLeaveData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnDragLeaveData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnDragLeaveData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnDragLeaveData]
  }
}

