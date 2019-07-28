package typings.reactDashVirtualized

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Requireable
import typings.react.reactMod.Validator
import typings.reactDashVirtualized.distEsTableMod.Column
import typings.reactDashVirtualized.distEsTableMod.HeaderMouseEventHandlerParams
import typings.reactDashVirtualized.distEsTableMod.RowMouseEventHandlerParams
import typings.reactDashVirtualized.distEsTableMod.SortDirectionType
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import typings.reactDashVirtualized.distEsTableMod.TableRowProps
import typings.reactDashVirtualized.reactDashVirtualizedMod.Alignment
import typings.reactDashVirtualized.reactDashVirtualizedMod.Index
import typings.reactDashVirtualized.reactDashVirtualizedMod.IndexRange
import typings.reactDashVirtualized.reactDashVirtualizedMod.OverscanIndexRange
import typings.reactDashVirtualized.reactDashVirtualizedMod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelAutoHeight extends js.Object {
  var `aria-label`: Requireable[String]
  var autoHeight: Requireable[Boolean]
  var children: Validator[Column]
  var className: Requireable[String]
  var disableHeader: Requireable[Boolean]
  var estimatedRowSize: Validator[Double]
  var gridClassName: Requireable[String]
  var gridStyle: Requireable[CSSProperties]
  var headerClassName: Requireable[String]
  var headerHeight: Validator[Double]
  var headerRowRenderer: Requireable[TableHeaderRowRenderer]
  var headerStyle: Requireable[CSSProperties]
  var height: Validator[Double]
  var id: Requireable[String]
  var noRowsRenderer: Requireable[js.Function0[Element]]
  var onHeaderClick: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]]
  var onRowClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]
  var onRowDoubleClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]
  var onRowMouseOut: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]
  var onRowMouseOver: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]]
  var onRowsRendered: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]]
  var onScroll: Requireable[js.Function1[/* params */ ScrollEventData, Unit]]
  var overscanRowCount: Validator[Double]
  var rowClassName: Requireable[String | (js.Function1[/* params */ Index, String])]
  var rowCount: Validator[Double]
  var rowGetter: Validator[js.Function1[/* params */ Index, _]]
  var rowHeight: Validator[Double | (js.Function1[/* params */ Index, Double])]
  var rowRenderer: Requireable[js.Function1[/* props */ TableRowProps, ReactNode]]
  var rowStyle: Validator[CSSProperties | (js.Function1[/* params */ Index, CSSProperties])]
  var scrollToAlignment: Validator[Alignment]
  var scrollToIndex: Validator[Double]
  var scrollTop: Requireable[Double]
  var sort: Requireable[js.Function1[/* params */ Anon_SortBy, Unit]]
  var sortBy: Requireable[String]
  var sortDirection: Validator[SortDirectionType]
  var style: Requireable[CSSProperties]
  var tabIndex: Requireable[Double]
  var width: Validator[Double]
}

object Anon_ArialabelAutoHeight {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    autoHeight: Requireable[Boolean],
    children: Validator[Column],
    className: Requireable[String],
    disableHeader: Requireable[Boolean],
    estimatedRowSize: Validator[Double],
    gridClassName: Requireable[String],
    gridStyle: Requireable[CSSProperties],
    headerClassName: Requireable[String],
    headerHeight: Validator[Double],
    headerRowRenderer: Requireable[TableHeaderRowRenderer],
    headerStyle: Requireable[CSSProperties],
    height: Validator[Double],
    id: Requireable[String],
    noRowsRenderer: Requireable[js.Function0[Element]],
    onHeaderClick: Requireable[js.Function1[/* params */ HeaderMouseEventHandlerParams, Unit]],
    onRowClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowDoubleClick: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowMouseOut: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowMouseOver: Requireable[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]],
    onRowsRendered: Requireable[js.Function1[/* params */ IndexRange with OverscanIndexRange, Unit]],
    onScroll: Requireable[js.Function1[/* params */ ScrollEventData, Unit]],
    overscanRowCount: Validator[Double],
    rowClassName: Requireable[String | (js.Function1[/* params */ Index, String])],
    rowCount: Validator[Double],
    rowGetter: Validator[js.Function1[/* params */ Index, _]],
    rowHeight: Validator[Double | (js.Function1[/* params */ Index, Double])],
    rowRenderer: Requireable[js.Function1[/* props */ TableRowProps, ReactNode]],
    rowStyle: Validator[CSSProperties | (js.Function1[/* params */ Index, CSSProperties])],
    scrollToAlignment: Validator[Alignment],
    scrollToIndex: Validator[Double],
    scrollTop: Requireable[Double],
    sort: Requireable[js.Function1[/* params */ Anon_SortBy, Unit]],
    sortBy: Requireable[String],
    sortDirection: Validator[SortDirectionType],
    style: Requireable[CSSProperties],
    tabIndex: Requireable[Double],
    width: Validator[Double]
  ): Anon_ArialabelAutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, children = children, className = className, disableHeader = disableHeader, estimatedRowSize = estimatedRowSize, gridClassName = gridClassName, gridStyle = gridStyle, headerClassName = headerClassName, headerHeight = headerHeight, headerRowRenderer = headerRowRenderer, headerStyle = headerStyle, height = height, id = id, noRowsRenderer = noRowsRenderer, onHeaderClick = onHeaderClick, onRowClick = onRowClick, onRowDoubleClick = onRowDoubleClick, onRowMouseOut = onRowMouseOut, onRowMouseOver = onRowMouseOver, onRowsRendered = onRowsRendered, onScroll = onScroll, overscanRowCount = overscanRowCount, rowClassName = rowClassName, rowCount = rowCount, rowGetter = rowGetter, rowHeight = rowHeight, rowRenderer = rowRenderer, rowStyle = rowStyle, scrollToAlignment = scrollToAlignment, scrollToIndex = scrollToIndex, scrollTop = scrollTop, sort = sort, sortBy = sortBy, sortDirection = sortDirection, style = style, tabIndex = tabIndex, width = width)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_ArialabelAutoHeight]
  }
}

