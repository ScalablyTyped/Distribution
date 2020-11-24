package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatDataItem
  extends TreeNode
     with TreePath {
  
  var lowerSiblingCounts: js.Array[Double] = js.native
  
  var parentNode: TreeItem = js.native
}
object FlatDataItem {
  
  @scala.inline
  def apply(
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    parentNode: TreeItem,
    path: NumberOrStringArray
  ): FlatDataItem = {
    val __obj = js.Dynamic.literal(lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatDataItem]
  }
  
  @scala.inline
  implicit class FlatDataItemOps[Self <: FlatDataItem] (val x: Self) extends AnyVal {
    
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
    def setLowerSiblingCountsVarargs(value: Double*): Self = this.set("lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = this.set("lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: TreeItem): Self = this.set("parentNode", value.asInstanceOf[js.Any])
  }
}
