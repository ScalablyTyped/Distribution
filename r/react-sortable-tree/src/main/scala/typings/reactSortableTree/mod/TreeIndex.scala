package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeIndex extends StObject {
  
  var treeIndex: Double
}
object TreeIndex {
  
  inline def apply(treeIndex: Double): TreeIndex = {
    val __obj = js.Dynamic.literal(treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeIndex]
  }
  
  extension [Self <: TreeIndex](x: Self) {
    
    inline def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
