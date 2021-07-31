package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeIndex extends StObject {
  
  var treeIndex: Double
}
object TreeIndex {
  
  @scala.inline
  def apply(treeIndex: Double): TreeIndex = {
    val __obj = js.Dynamic.literal(treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeIndex]
  }
  
  @scala.inline
  implicit class TreeIndexMutableBuilder[Self <: TreeIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
