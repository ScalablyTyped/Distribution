package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragLeaveData extends js.Object {
  var event: reactLib.Event
  var node: InternalTreeNode
}

object OnDragLeaveData {
  @scala.inline
  def apply(event: reactLib.Event, node: InternalTreeNode): OnDragLeaveData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[OnDragLeaveData]
  }
}

