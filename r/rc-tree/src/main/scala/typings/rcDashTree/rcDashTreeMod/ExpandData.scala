package typings.rcDashTree.rcDashTreeMod

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
    val __obj = js.Dynamic.literal(expanded = expanded, node = node)
  
    __obj.asInstanceOf[ExpandData]
  }
}

