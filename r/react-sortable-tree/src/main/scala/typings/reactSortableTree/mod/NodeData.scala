package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeData
  extends StObject
     with TreeNode
     with TreePath
     with TreeIndex
object NodeData {
  
  inline def apply(node: TreeItem, path: NumberOrStringArray, treeIndex: Double): NodeData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
}
