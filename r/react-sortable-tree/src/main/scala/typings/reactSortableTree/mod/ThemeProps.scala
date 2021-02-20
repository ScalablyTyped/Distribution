package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeProps extends ThemeTreeProps {
  
  var treeNodeRenderer: js.UndefOr[TreeRenderer] = js.native
}
object ThemeProps {
  
  @scala.inline
  def apply(): ThemeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps]
  }
  
  @scala.inline
  implicit class ThemePropsMutableBuilder[Self <: ThemeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreeNodeRenderer(value: TreeRenderer): Self = StObject.set(x, "treeNodeRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeNodeRendererUndefined: Self = StObject.set(x, "treeNodeRenderer", js.undefined)
  }
}
