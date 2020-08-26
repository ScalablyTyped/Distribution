package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldCopyData extends js.Object {
  var node: TreeNode = js.native
  var prevPath: NumberOrStringArray = js.native
  var prevTreeIndex: Double = js.native
}

object ShouldCopyData {
  @scala.inline
  def apply(node: TreeNode, prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldCopyData]
  }
  @scala.inline
  implicit class ShouldCopyDataOps[Self <: ShouldCopyData] (val x: Self) extends AnyVal {
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
    def setNode(value: TreeNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevPathVarargs(value: (String | Double)*): Self = this.set("prevPath", js.Array(value :_*))
    @scala.inline
    def setPrevPath(value: NumberOrStringArray): Self = this.set("prevPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevTreeIndex(value: Double): Self = this.set("prevTreeIndex", value.asInstanceOf[js.Any])
  }
  
}

