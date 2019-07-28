package typings.primereact

import typings.primereact.componentsTreenodeTreeNodeMod.TreeNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeOriginalEvent extends js.Object {
  var node: TreeNode
  var originalEvent: Event
}

object Anon_NodeOriginalEvent {
  @scala.inline
  def apply(node: TreeNode, originalEvent: Event): Anon_NodeOriginalEvent = {
    val __obj = js.Dynamic.literal(node = node, originalEvent = originalEvent)
  
    __obj.asInstanceOf[Anon_NodeOriginalEvent]
  }
}

