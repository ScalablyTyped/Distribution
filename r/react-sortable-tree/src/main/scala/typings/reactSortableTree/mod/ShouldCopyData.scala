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
  
  inline def apply(node: TreeNode, prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldCopyData]
  }
  
  extension [Self <: ShouldCopyData](x: Self) {
    
    inline def setNode(value: TreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPrevPath(value: NumberOrStringArray): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
    
    inline def setPrevPathVarargs(value: (String | Double)*): Self = StObject.set(x, "prevPath", js.Array(value :_*))
    
    inline def setPrevTreeIndex(value: Double): Self = StObject.set(x, "prevTreeIndex", value.asInstanceOf[js.Any])
  }
}
