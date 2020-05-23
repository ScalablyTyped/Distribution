package typings.rcTree.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEnterData extends js.Object {
  var event: Event
  var expandedKeys: js.Array[String]
  var node: InternalTreeNode
}

object OnDragEnterData {
  @scala.inline
  def apply(event: Event, expandedKeys: js.Array[String], node: InternalTreeNode): OnDragEnterData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragEnterData]
  }
}

