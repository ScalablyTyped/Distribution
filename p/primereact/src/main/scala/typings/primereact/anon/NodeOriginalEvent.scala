package typings.primereact.anon

import typings.primereact.treeNodeMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOriginalEvent extends js.Object {
  var node: TreeNode
  var originalEvent: typings.std.Event
}

object NodeOriginalEvent {
  @scala.inline
  def apply(node: TreeNode, originalEvent: typings.std.Event): NodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOriginalEvent]
  }
}

