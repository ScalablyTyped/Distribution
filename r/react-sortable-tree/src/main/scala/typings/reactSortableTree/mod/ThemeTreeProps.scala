package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.reactSortableTree.anon.PartialListProps
import typings.reactVirtualized.mod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeTreeProps extends StObject {
  
  var innerStyle: js.UndefOr[CSSProperties] = js.native
  
  var nodeContentRenderer: js.UndefOr[NodeRenderer] = js.native
  
  var placeholderRenderer: js.UndefOr[PlaceholderRenderer] = js.native
  
  var reactVirtualizedListProps: js.UndefOr[PartialListProps] = js.native
  
  var rowHeight: js.UndefOr[(js.Function1[/* info */ NodeData with Index, Double]) | Double] = js.native
  
  var scaffoldBlockPxWidth: js.UndefOr[Double] = js.native
  
  var slideRegionSize: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object ThemeTreeProps {
  
  @scala.inline
  def apply(): ThemeTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTreeProps]
  }
  
  @scala.inline
  implicit class ThemeTreePropsMutableBuilder[Self <: ThemeTreeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerStyle(value: CSSProperties): Self = StObject.set(x, "innerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerStyleUndefined: Self = StObject.set(x, "innerStyle", js.undefined)
    
    @scala.inline
    def setNodeContentRenderer(value: NodeRenderer): Self = StObject.set(x, "nodeContentRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeContentRendererUndefined: Self = StObject.set(x, "nodeContentRenderer", js.undefined)
    
    @scala.inline
    def setPlaceholderRenderer(value: PlaceholderRenderer): Self = StObject.set(x, "placeholderRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderRendererUndefined: Self = StObject.set(x, "placeholderRenderer", js.undefined)
    
    @scala.inline
    def setReactVirtualizedListProps(value: PartialListProps): Self = StObject.set(x, "reactVirtualizedListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactVirtualizedListPropsUndefined: Self = StObject.set(x, "reactVirtualizedListProps", js.undefined)
    
    @scala.inline
    def setRowHeight(value: (js.Function1[/* info */ NodeData with Index, Double]) | Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightFunction1(value: /* info */ NodeData with Index => Double): Self = StObject.set(x, "rowHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setScaffoldBlockPxWidth(value: Double): Self = StObject.set(x, "scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaffoldBlockPxWidthUndefined: Self = StObject.set(x, "scaffoldBlockPxWidth", js.undefined)
    
    @scala.inline
    def setSlideRegionSize(value: Double): Self = StObject.set(x, "slideRegionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideRegionSizeUndefined: Self = StObject.set(x, "slideRegionSize", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
