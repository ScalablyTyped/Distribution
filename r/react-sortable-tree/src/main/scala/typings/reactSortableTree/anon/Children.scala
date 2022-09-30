package typings.reactSortableTree.anon

import typings.react.mod.ReactNode
import typings.reactSortableTree.mod.GetTreeItemChildren
import typings.reactSortableTree.mod.GetTreeItemChildrenFn
import typings.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[T] extends StObject {
  
  var children: js.UndefOr[js.Array[TreeItem[T]] | GetTreeItemChildrenFn[T]] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object Children {
  
  inline def apply[T](): Children[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[T]]
  }
  
  extension [Self <: Children[?], T](x: Self & Children[T]) {
    
    inline def setChildren(value: js.Array[TreeItem[T]] | GetTreeItemChildrenFn[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* data */ GetTreeItemChildren[T] => Unit): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: TreeItem[T]*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
