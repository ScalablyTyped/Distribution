package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.TreeNode & react-sortable-tree.react-sortable-tree.TreePath & {  lowerSiblingsCounts :std.Array<number>} */
@js.native
trait TreeNodeTreePathlowerSibl extends StObject {
  
  var lowerSiblingsCounts: js.Array[Double] = js.native
  
  var node: TreeItem = js.native
  
  var path: NumberOrStringArray = js.native
}
object TreeNodeTreePathlowerSibl {
  
  @scala.inline
  def apply(lowerSiblingsCounts: js.Array[Double], node: TreeItem, path: NumberOrStringArray): TreeNodeTreePathlowerSibl = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeTreePathlowerSibl]
  }
  
  @scala.inline
  implicit class TreeNodeTreePathlowerSiblMutableBuilder[Self <: TreeNodeTreePathlowerSibl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerSiblingsCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingsCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerSiblingsCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingsCounts", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
