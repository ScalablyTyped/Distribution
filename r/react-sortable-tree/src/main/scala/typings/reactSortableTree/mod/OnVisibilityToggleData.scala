package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnVisibilityToggleData
  extends FullTree
     with TreeNode {
  
  var expanded: Boolean = js.native
}
object OnVisibilityToggleData {
  
  @scala.inline
  def apply(expanded: Boolean, node: TreeItem, treeData: js.Array[TreeItem]): OnVisibilityToggleData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVisibilityToggleData]
  }
  
  @scala.inline
  implicit class OnVisibilityToggleDataMutableBuilder[Self <: OnVisibilityToggleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
