package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragStartData extends js.Object {
  var event: stdLib.Event
  var node: InternalTreeNode
}

object OnDragStartData {
  @scala.inline
  def apply(event: stdLib.Event, node: InternalTreeNode): OnDragStartData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnDragStartData]
  }
}

