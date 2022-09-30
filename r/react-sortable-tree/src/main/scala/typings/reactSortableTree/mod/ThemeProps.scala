package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeProps[T]
  extends StObject
     with ThemeTreeProps[T] {
  
  var treeNodeRenderer: js.UndefOr[TreeRenderer[T]] = js.undefined
}
object ThemeProps {
  
  inline def apply[T](): ThemeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps[T]]
  }
  
  extension [Self <: ThemeProps[?], T](x: Self & ThemeProps[T]) {
    
    inline def setTreeNodeRenderer(value: TreeRenderer[T]): Self = StObject.set(x, "treeNodeRenderer", value.asInstanceOf[js.Any])
    
    inline def setTreeNodeRendererUndefined: Self = StObject.set(x, "treeNodeRenderer", js.undefined)
  }
}
