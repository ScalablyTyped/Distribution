package typings.rcDashTree.rcDashTreeMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEndData extends js.Object {
  var event: Event
  var node: InternalTreeNode
}

object OnDragEndData {
  @scala.inline
  def apply(event: Event, node: InternalTreeNode): OnDragEndData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnDragEndData]
  }
}

