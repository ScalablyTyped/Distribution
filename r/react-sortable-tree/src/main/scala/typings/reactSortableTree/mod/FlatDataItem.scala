package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatDataItem
  extends StObject
     with TreeNode
     with TreePath {
  
  var lowerSiblingCounts: js.Array[Double]
  
  var parentNode: TreeItem
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
  implicit class FlatDataItemMutableBuilder[Self <: FlatDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value :_*))
    
    @scala.inline
    def setParentNode(value: TreeItem): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
  }
}
