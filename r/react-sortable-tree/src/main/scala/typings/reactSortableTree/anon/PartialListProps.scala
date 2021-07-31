package typings.reactSortableTree.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.esListMod.ListRowProps
import typings.reactVirtualized.esListMod.ListRowRenderer
import typings.reactVirtualized.esListMod.RenderedRows
import typings.reactVirtualized.esScrollSyncMod.OnScrollParams
import typings.reactVirtualized.mod.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-virtualized.react-virtualized.ListProps> */
trait PartialListProps extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  
  var autoContainerWidth: js.UndefOr[Boolean] = js.undefined
  
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var containerProps: js.UndefOr[js.Object] = js.undefined
  
  var containerRole: js.UndefOr[String] = js.undefined
  
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.undefined
  
  var estimatedColumnSize: js.UndefOr[Double] = js.undefined
  
  var estimatedRowSize: js.UndefOr[Double] = js.undefined
  
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  
  var noContentRenderer: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  var noRowsRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
  
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ RenderedRows, Unit]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]] = js.undefined
  
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, js.Any]] = js.undefined
  
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, js.Any]] = js.undefined
  
  var overscanColumnCount: js.UndefOr[Double] = js.undefined
  
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.undefined
  
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var rowCount: js.UndefOr[Double] = js.undefined
  
  var rowHeight: js.UndefOr[Double | (js.Function1[/* info */ Index, Double])] = js.undefined
  
  var rowRenderer: js.UndefOr[ListRowRenderer] = js.undefined
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  var scrollToAlignment: js.UndefOr[String] = js.undefined
  
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  
  var scrollToIndex: js.UndefOr[Double] = js.undefined
  
  var scrollToRow: js.UndefOr[Double] = js.undefined
  
  var scrollTop: js.UndefOr[Double] = js.undefined
  
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var tabIndex: js.UndefOr[Double | Null] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialListProps {
  
  @scala.inline
  def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  
  @scala.inline
  implicit class PartialListPropsMutableBuilder[Self <: PartialListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def setAutoContainerWidth(value: Boolean): Self = StObject.set(x, "autoContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoContainerWidthUndefined: Self = StObject.set(x, "autoContainerWidth", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactNode]): Self = StObject.set(x, "cellRangeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellRangeRendererUndefined: Self = StObject.set(x, "cellRangeRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContainerProps(value: js.Object): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
    
    @scala.inline
    def setContainerRole(value: String): Self = StObject.set(x, "containerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerRoleUndefined: Self = StObject.set(x, "containerRole", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDeferredMeasurementCache(value: CellMeasurerCache): Self = StObject.set(x, "deferredMeasurementCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredMeasurementCacheUndefined: Self = StObject.set(x, "deferredMeasurementCache", js.undefined)
    
    @scala.inline
    def setEstimatedColumnSize(value: Double): Self = StObject.set(x, "estimatedColumnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedColumnSizeUndefined: Self = StObject.set(x, "estimatedColumnSize", js.undefined)
    
    @scala.inline
    def setEstimatedRowSize(value: Double): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowSizeUndefined: Self = StObject.set(x, "estimatedRowSize", js.undefined)
    
    @scala.inline
    def setGetScrollbarSize(value: () => Double): Self = StObject.set(x, "getScrollbarSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScrollbarSizeUndefined: Self = StObject.set(x, "getScrollbarSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollingUndefined: Self = StObject.set(x, "isScrolling", js.undefined)
    
    @scala.inline
    def setNoContentRenderer(value: () => ReactNode): Self = StObject.set(x, "noContentRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNoContentRendererUndefined: Self = StObject.set(x, "noContentRenderer", js.undefined)
    
    @scala.inline
    def setNoRowsRenderer(value: () => Element): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNoRowsRendererUndefined: Self = StObject.set(x, "noRowsRenderer", js.undefined)
    
    @scala.inline
    def setOnRowsRendered(value: /* info */ RenderedRows => Unit): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowsRenderedUndefined: Self = StObject.set(x, "onRowsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* params */ OnScrollParams => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => js.Any): Self = StObject.set(x, "onScrollbarPresenceChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollbarPresenceChangeUndefined: Self = StObject.set(x, "onScrollbarPresenceChange", js.undefined)
    
    @scala.inline
    def setOnSectionRendered(value: /* params */ SectionRenderedParams => js.Any): Self = StObject.set(x, "onSectionRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSectionRenderedUndefined: Self = StObject.set(x, "onSectionRendered", js.undefined)
    
    @scala.inline
    def setOverscanColumnCount(value: Double): Self = StObject.set(x, "overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanColumnCountUndefined: Self = StObject.set(x, "overscanColumnCount", js.undefined)
    
    @scala.inline
    def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = StObject.set(x, "overscanIndicesGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOverscanIndicesGetterUndefined: Self = StObject.set(x, "overscanIndicesGetter", js.undefined)
    
    @scala.inline
    def setOverscanRowCount(value: Double): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowCountUndefined: Self = StObject.set(x, "overscanRowCount", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double | (js.Function1[/* info */ Index, Double])): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightFunction1(value: /* info */ Index => Double): Self = StObject.set(x, "rowHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setRowRenderer(value: /* props */ ListRowProps => ReactNode): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowRendererUndefined: Self = StObject.set(x, "rowRenderer", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollToAlignment(value: String): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToAlignmentUndefined: Self = StObject.set(x, "scrollToAlignment", js.undefined)
    
    @scala.inline
    def setScrollToColumn(value: Double): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToColumnUndefined: Self = StObject.set(x, "scrollToColumn", js.undefined)
    
    @scala.inline
    def setScrollToIndex(value: Double): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToIndexUndefined: Self = StObject.set(x, "scrollToIndex", js.undefined)
    
    @scala.inline
    def setScrollToRow(value: Double): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToRowUndefined: Self = StObject.set(x, "scrollToRow", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    @scala.inline
    def setScrollingResetTimeInterval(value: Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollingResetTimeIntervalUndefined: Self = StObject.set(x, "scrollingResetTimeInterval", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
