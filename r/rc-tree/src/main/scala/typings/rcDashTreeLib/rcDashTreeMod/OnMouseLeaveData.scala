package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseLeaveData extends js.Object {
  var event: reactLib.Event
  var node: InternalTreeNode
}

object OnMouseLeaveData {
  @scala.inline
  def apply(event: reactLib.Event, node: InternalTreeNode): OnMouseLeaveData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[OnMouseLeaveData]
  }
}

