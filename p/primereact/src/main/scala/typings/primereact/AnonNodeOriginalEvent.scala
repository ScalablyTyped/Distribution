package typings.primereact

import typings.primereact.treeNodeMod.TreeNode
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeOriginalEvent extends js.Object {
  var node: TreeNode
  var originalEvent: Event_
}

object AnonNodeOriginalEvent {
  @scala.inline
  def apply(node: TreeNode, originalEvent: Event_): AnonNodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNodeOriginalEvent]
  }
}

