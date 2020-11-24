package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTreeItemChildren extends js.Object {
  
  def done(children: js.Array[TreeItem]): Unit = js.native
  
  var lowerSiblingCounts: js.Array[Double] = js.native
  
  var node: TreeItem = js.native
  
  var path: NumberOrStringArray = js.native
  
  var treeIndex: Double = js.native
}
object GetTreeItemChildren {
  
  @scala.inline
  def apply(
    done: js.Array[TreeItem] => Unit,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): GetTreeItemChildren = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTreeItemChildren]
  }
  
  @scala.inline
  implicit class GetTreeItemChildrenOps[Self <: GetTreeItemChildren] (val x: Self) extends AnyVal {
    
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
    def setDone(value: js.Array[TreeItem] => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = this.set("lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = this.set("lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: TreeItem): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIndex(value: Double): Self = this.set("treeIndex", value.asInstanceOf[js.Any])
  }
}
