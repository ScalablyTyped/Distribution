package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRightClickData extends js.Object {
  var event: stdLib.Event
  var node: InternalTreeNode
}

object OnRightClickData {
  @scala.inline
  def apply(event: stdLib.Event, node: InternalTreeNode): OnRightClickData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnRightClickData]
  }
}

