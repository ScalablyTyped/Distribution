package typings.reactSortableTree.mod

import typings.react.mod.CSSProperties
import typings.reactSortableTree.anon.PartialListProps
import typings.reactVirtualized.mod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTreeProps extends StObject {
  
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var nodeContentRenderer: js.UndefOr[NodeRenderer] = js.undefined
  
  var placeholderRenderer: js.UndefOr[PlaceholderRenderer] = js.undefined
  
  var reactVirtualizedListProps: js.UndefOr[PartialListProps] = js.undefined
  
  var rowHeight: js.UndefOr[(js.Function1[/* info */ NodeData & Index, Double]) | Double] = js.undefined
  
  var scaffoldBlockPxWidth: js.UndefOr[Double] = js.undefined
  
  var slideRegionSize: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ThemeTreeProps {
  
  inline def apply(): ThemeTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTreeProps]
  }
  
  extension [Self <: ThemeTreeProps](x: Self) {
    
    inline def setInnerStyle(value: CSSProperties): Self = StObject.set(x, "innerStyle", value.asInstanceOf[js.Any])
    
    inline def setInnerStyleUndefined: Self = StObject.set(x, "innerStyle", js.undefined)
    
    inline def setNodeContentRenderer(value: NodeRenderer): Self = StObject.set(x, "nodeContentRenderer", value.asInstanceOf[js.Any])
    
    inline def setNodeContentRendererUndefined: Self = StObject.set(x, "nodeContentRenderer", js.undefined)
    
    inline def setPlaceholderRenderer(value: PlaceholderRenderer): Self = StObject.set(x, "placeholderRenderer", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderRendererUndefined: Self = StObject.set(x, "placeholderRenderer", js.undefined)
    
    inline def setReactVirtualizedListProps(value: PartialListProps): Self = StObject.set(x, "reactVirtualizedListProps", value.asInstanceOf[js.Any])
    
    inline def setReactVirtualizedListPropsUndefined: Self = StObject.set(x, "reactVirtualizedListProps", js.undefined)
    
    inline def setRowHeight(value: (js.Function1[/* info */ NodeData & Index, Double]) | Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightFunction1(value: /* info */ NodeData & Index => Double): Self = StObject.set(x, "rowHeight", js.Any.fromFunction1(value))
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setScaffoldBlockPxWidth(value: Double): Self = StObject.set(x, "scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    inline def setScaffoldBlockPxWidthUndefined: Self = StObject.set(x, "scaffoldBlockPxWidth", js.undefined)
    
    inline def setSlideRegionSize(value: Double): Self = StObject.set(x, "slideRegionSize", value.asInstanceOf[js.Any])
    
    inline def setSlideRegionSizeUndefined: Self = StObject.set(x, "slideRegionSize", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
