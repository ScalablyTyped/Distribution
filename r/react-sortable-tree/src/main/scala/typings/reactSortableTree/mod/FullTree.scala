package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullTree extends StObject {
  
  var treeData: js.Array[TreeItem] = js.native
}
object FullTree {
  
  @scala.inline
  def apply(treeData: js.Array[TreeItem]): FullTree = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTree]
  }
  
  @scala.inline
  implicit class FullTreeMutableBuilder[Self <: FullTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
