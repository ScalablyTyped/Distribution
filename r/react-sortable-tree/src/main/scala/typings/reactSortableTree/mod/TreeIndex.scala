package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeIndex extends js.Object {
  var treeIndex: Double = js.native
}

object TreeIndex {
  @scala.inline
  def apply(treeIndex: Double): TreeIndex = {
    val __obj = js.Dynamic.literal(treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeIndex]
  }
  @scala.inline
  implicit class TreeIndexOps[Self <: TreeIndex] (val x: Self) extends AnyVal {
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
    def setTreeIndex(value: Double): Self = this.set("treeIndex", value.asInstanceOf[js.Any])
  }
  
}

