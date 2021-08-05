package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreeIndex & react-sortable-tree.react-sortable-tree.TreePath & {  parentNode :react-sortable-tree.react-sortable-tree.TreeItem} */
trait FullTreeTreeIndexTreePath extends StObject {
  
  var parentNode: TreeItem
  
  var path: NumberOrStringArray
  
  var treeData: js.Array[TreeItem]
  
  var treeIndex: Double
}
object FullTreeTreeIndexTreePath {
  
  inline def apply(parentNode: TreeItem, path: NumberOrStringArray, treeData: js.Array[TreeItem], treeIndex: Double): FullTreeTreeIndexTreePath = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreeIndexTreePath]
  }
  
  extension [Self <: FullTreeTreeIndexTreePath](x: Self) {
    
    inline def setParentNode(value: TreeItem): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
    
    inline def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
