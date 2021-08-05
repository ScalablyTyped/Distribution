package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NodeData
import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  matches :std.Array<react-sortable-tree.react-sortable-tree.NodeData>} & react-sortable-tree.react-sortable-tree.FullTree */
trait matchesArrayNodeDataFullT extends StObject {
  
  var matches: js.Array[NodeData]
  
  var treeData: js.Array[TreeItem]
}
object matchesArrayNodeDataFullT {
  
  inline def apply(matches: js.Array[NodeData], treeData: js.Array[TreeItem]): matchesArrayNodeDataFullT = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[matchesArrayNodeDataFullT]
  }
  
  extension [Self <: matchesArrayNodeDataFullT](x: Self) {
    
    inline def setMatches(value: js.Array[NodeData]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: NodeData*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    inline def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
