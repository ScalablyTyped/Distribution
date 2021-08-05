package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  expanded :boolean | undefined} */
trait FullTreeexpandedbooleanun extends StObject {
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var treeData: js.Array[TreeItem]
}
object FullTreeexpandedbooleanun {
  
  inline def apply(treeData: js.Array[TreeItem]): FullTreeexpandedbooleanun = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeexpandedbooleanun]
  }
  
  extension [Self <: FullTreeexpandedbooleanun](x: Self) {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
