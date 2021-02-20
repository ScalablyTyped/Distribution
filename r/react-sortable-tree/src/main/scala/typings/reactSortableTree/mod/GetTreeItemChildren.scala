package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTreeItemChildren extends StObject {
  
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
  implicit class GetTreeItemChildrenMutableBuilder[Self <: GetTreeItemChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: js.Array[TreeItem] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
