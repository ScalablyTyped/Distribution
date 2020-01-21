package typings.rcTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandData extends js.Object {
  var expanded: Boolean
  var node: InternalTreeNode
}

object ExpandData {
  @scala.inline
  def apply(expanded: Boolean, node: InternalTreeNode): ExpandData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandData]
  }
}

