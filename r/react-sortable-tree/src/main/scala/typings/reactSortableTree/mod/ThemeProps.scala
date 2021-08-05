package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProps
  extends StObject
     with ThemeTreeProps {
  
  var treeNodeRenderer: js.UndefOr[TreeRenderer] = js.undefined
}
object ThemeProps {
  
  inline def apply(): ThemeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps]
  }
  
  extension [Self <: ThemeProps](x: Self) {
    
    inline def setTreeNodeRenderer(value: TreeRenderer): Self = StObject.set(x, "treeNodeRenderer", value.asInstanceOf[js.Any])
    
    inline def setTreeNodeRendererUndefined: Self = StObject.set(x, "treeNodeRenderer", js.undefined)
  }
}
