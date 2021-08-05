package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeItem
  extends StObject
     with /* x */ StringDictionary[js.Any] {
  
  var children: js.UndefOr[js.Array[TreeItem] | GetTreeItemChildrenFn] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object TreeItem {
  
  inline def apply(): TreeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeItem]
  }
  
  extension [Self <: TreeItem](x: Self) {
    
    inline def setChildren(value: js.Array[TreeItem] | GetTreeItemChildrenFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* data */ GetTreeItemChildren => Unit): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: TreeItem*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
