package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEndData extends js.Object {
  var event: reactLib.Event
  var node: InternalTreeNode
}

object OnDragEndData {
  @scala.inline
  def apply(event: reactLib.Event, node: InternalTreeNode): OnDragEndData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnDragEndData]
  }
}

