package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeData[T]
  extends StObject
     with TreeNode[T]
     with TreePath
     with TreeIndex
object NodeData {
  
  inline def apply[T](node: TreeItem[T], path: NumberOrStringArray, treeIndex: Double): NodeData[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData[T]]
  }
}
