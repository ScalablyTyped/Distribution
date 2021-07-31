package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldCopyData extends StObject {
  
  var node: TreeNode
  
  var prevPath: NumberOrStringArray
  
  var prevTreeIndex: Double
}
object ShouldCopyData {
  
  @scala.inline
  def apply(node: TreeNode, prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldCopyData]
  }
  
  @scala.inline
  implicit class ShouldCopyDataMutableBuilder[Self <: ShouldCopyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: TreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPath(value: NumberOrStringArray): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPathVarargs(value: (String | Double)*): Self = StObject.set(x, "prevPath", js.Array(value :_*))
    
    @scala.inline
    def setPrevTreeIndex(value: Double): Self = StObject.set(x, "prevTreeIndex", value.asInstanceOf[js.Any])
  }
}
