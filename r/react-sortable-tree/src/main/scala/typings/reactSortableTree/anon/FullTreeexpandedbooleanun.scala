package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  expanded :boolean | undefined} */
@js.native
trait FullTreeexpandedbooleanun extends StObject {
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object FullTreeexpandedbooleanun {
  
  @scala.inline
  def apply(treeData: js.Array[TreeItem]): FullTreeexpandedbooleanun = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeexpandedbooleanun]
  }
  
  @scala.inline
  implicit class FullTreeexpandedbooleanunMutableBuilder[Self <: FullTreeexpandedbooleanun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
