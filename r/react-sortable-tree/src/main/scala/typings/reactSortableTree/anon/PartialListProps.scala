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
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.esListMod.ListRowProps
import typings.reactVirtualized.esListMod.ListRowRenderer
import typings.reactVirtualized.esListMod.RenderedRows
import typings.reactVirtualized.esScrollSyncMod.OnScrollParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-virtualized.react-virtualized.ListProps> */
@js.native
trait PartialListProps extends js.Object {
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  
  var autoContainerWidth: js.UndefOr[Boolean] = js.native
  
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  var cellRangeRenderer: js.UndefOr[GridCellRangeRenderer] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var containerProps: js.UndefOr[js.Object] = js.native
  
  var containerRole: js.UndefOr[String] = js.native
  
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  var deferredMeasurementCache: js.UndefOr[CellMeasurerCache] = js.native
  
  var estimatedColumnSize: js.UndefOr[Double] = js.native
  
  var estimatedRowSize: js.UndefOr[Double] = js.native
  
  var getScrollbarSize: js.UndefOr[js.Function0[Double]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isScrolling: js.UndefOr[Boolean] = js.native
  
  var noContentRenderer: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var noRowsRenderer: js.UndefOr[js.Function0[Element]] = js.native
  
  var onRowsRendered: js.UndefOr[js.Function1[/* info */ RenderedRows, Unit]] = js.native
  
  var onScroll: js.UndefOr[
    (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]])
  ] = js.native
  
  var onScrollbarPresenceChange: js.UndefOr[js.Function1[/* params */ ScrollbarPresenceParams, _]] = js.native
  
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.native
  
  var overscanColumnCount: js.UndefOr[Double] = js.native
  
  var overscanIndicesGetter: js.UndefOr[OverscanIndicesGetter] = js.native
  
  var overscanRowCount: js.UndefOr[Double] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var rowCount: js.UndefOr[Double] = js.native
  
  var rowHeight: js.UndefOr[Double | (js.Function1[/* params */ Index, Double])] = js.native
  
  var rowRenderer: js.UndefOr[ListRowRenderer] = js.native
  
  var scrollLeft: js.UndefOr[Double] = js.native
  
  var scrollToAlignment: js.UndefOr[js.UndefOr[Alignment] with js.UndefOr[String]] = js.native
  
  var scrollToColumn: js.UndefOr[Double] = js.native
  
  var scrollToIndex: js.UndefOr[Double] = js.native
  
  var scrollToRow: js.UndefOr[Double] = js.native
  
  var scrollTop: js.UndefOr[Double] = js.native
  
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double | Null] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialListProps {
  
  @scala.inline
  def apply(): PartialListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListProps]
  }
  
  @scala.inline
  implicit class PartialListPropsOps[Self <: PartialListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def setAutoContainerWidth(value: Boolean): Self = this.set("autoContainerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoContainerWidth: Self = this.set("autoContainerWidth", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    
    @scala.inline
    def setCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactNode]): Self = this.set("cellRangeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellRangeRenderer: Self = this.set("cellRangeRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainerProps(value: js.Object): Self = this.set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerProps: Self = this.set("containerProps", js.undefined)
    
    @scala.inline
    def setContainerRole(value: String): Self = this.set("containerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerRole: Self = this.set("containerRole", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setDeferredMeasurementCache(value: CellMeasurerCache): Self = this.set("deferredMeasurementCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredMeasurementCache: Self = this.set("deferredMeasurementCache", js.undefined)
    
    @scala.inline
    def setEstimatedColumnSize(value: Double): Self = this.set("estimatedColumnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedColumnSize: Self = this.set("estimatedColumnSize", js.undefined)
    
    @scala.inline
    def setEstimatedRowSize(value: Double): Self = this.set("estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedRowSize: Self = this.set("estimatedRowSize", js.undefined)
    
    @scala.inline
    def setGetScrollbarSize(value: () => Double): Self = this.set("getScrollbarSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollbarSize: Self = this.set("getScrollbarSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsScrolling: Self = this.set("isScrolling", js.undefined)
    
    @scala.inline
    def setNoContentRenderer(value: () => ReactNode): Self = this.set("noContentRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNoContentRenderer: Self = this.set("noContentRenderer", js.undefined)
    
    @scala.inline
    def setNoRowsRenderer(value: () => Element): Self = this.set("noRowsRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNoRowsRenderer: Self = this.set("noRowsRenderer", js.undefined)
    
    @scala.inline
    def setOnRowsRendered(value: /* info */ RenderedRows => Unit): Self = this.set("onRowsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowsRendered: Self = this.set("onRowsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(
      value: (js.UndefOr[js.Function1[/* params */ ScrollParams, _]]) with (js.UndefOr[js.Function1[/* params */ OnScrollParams, Unit]])
    ): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollbarPresenceChange(value: /* params */ ScrollbarPresenceParams => _): Self = this.set("onScrollbarPresenceChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollbarPresenceChange: Self = this.set("onScrollbarPresenceChange", js.undefined)
    
    @scala.inline
    def setOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = this.set("onSectionRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSectionRendered: Self = this.set("onSectionRendered", js.undefined)
    
    @scala.inline
    def setOverscanColumnCount(value: Double): Self = this.set("overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanColumnCount: Self = this.set("overscanColumnCount", js.undefined)
    
    @scala.inline
    def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = this.set("overscanIndicesGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverscanIndicesGetter: Self = this.set("overscanIndicesGetter", js.undefined)
    
    @scala.inline
    def setOverscanRowCount(value: Double): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanRowCount: Self = this.set("overscanRowCount", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRowHeightFunction1(value: /* params */ Index => Double): Self = this.set("rowHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeight(value: Double | (js.Function1[/* params */ Index, Double])): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setRowRenderer(value: /* props */ ListRowProps => ReactNode): Self = this.set("rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowRenderer: Self = this.set("rowRenderer", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollToAlignment(value: js.UndefOr[Alignment] with js.UndefOr[String]): Self = this.set("scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToAlignment: Self = this.set("scrollToAlignment", js.undefined)
    
    @scala.inline
    def setScrollToColumn(value: Double): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToColumn: Self = this.set("scrollToColumn", js.undefined)
    
    @scala.inline
    def setScrollToIndex(value: Double): Self = this.set("scrollToIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToIndex: Self = this.set("scrollToIndex", js.undefined)
    
    @scala.inline
    def setScrollToRow(value: Double): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToRow: Self = this.set("scrollToRow", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setScrollingResetTimeInterval(value: Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingResetTimeInterval: Self = this.set("scrollingResetTimeInterval", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTabIndexNull: Self = this.set("tabIndex", null)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
