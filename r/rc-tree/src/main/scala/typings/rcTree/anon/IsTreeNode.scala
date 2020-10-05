package typings.rcTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsTreeNode extends js.Object {
  var isTreeNode: Boolean = js.native
}

object IsTreeNode {
  @scala.inline
  def apply(isTreeNode: Boolean): IsTreeNode = {
    val __obj = js.Dynamic.literal(isTreeNode = isTreeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTreeNode]
  }
  @scala.inline
  implicit class IsTreeNodeOps[Self <: IsTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsTreeNode(value: Boolean): Self = this.set("isTreeNode", value.asInstanceOf[js.Any])
  }
  
}

