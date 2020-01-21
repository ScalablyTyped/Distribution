package typings.reactVirtualized

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.react.mod._Global_.JSX.Element
import typings.reactVirtualized.esTableMod.Column
import typings.reactVirtualized.esTableMod.HeaderMouseEventHandlerParams
import typings.reactVirtualized.esTableMod.RowMouseEventHandlerParams
import typings.reactVirtualized.esTableMod.SortDirectionType
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowProps
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.IndexRange
import typings.reactVirtualized.mod.OverscanIndexRange
import typings.reactVirtualized.mod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArialabelAutoHeight extends js.Object {
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
  var sort: Requireable[js.Function1[/* params */ AnonSortBy, Unit]]
  var sortBy: Requireable[String]
  var sortDirection: Validator[SortDirectionType]
  var style: Requireable[CSSProperties]
  var tabIndex: Requireable[Double]
  var width: Validator[Double]
}

object AnonArialabelAutoHeight {
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
    sort: Requireable[js.Function1[/* params */ AnonSortBy, Unit]],
    sortBy: Requireable[String],
    sortDirection: Validator[SortDirectionType],
    style: Requireable[CSSProperties],
    tabIndex: Requireable[Double],
    width: Validator[Double]
  ): AnonArialabelAutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], gridClassName = gridClassName.asInstanceOf[js.Any], gridStyle = gridStyle.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerRowRenderer = headerRowRenderer.asInstanceOf[js.Any], headerStyle = headerStyle.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], noRowsRenderer = noRowsRenderer.asInstanceOf[js.Any], onHeaderClick = onHeaderClick.asInstanceOf[js.Any], onRowClick = onRowClick.asInstanceOf[js.Any], onRowDoubleClick = onRowDoubleClick.asInstanceOf[js.Any], onRowMouseOut = onRowMouseOut.asInstanceOf[js.Any], onRowMouseOver = onRowMouseOver.asInstanceOf[js.Any], onRowsRendered = onRowsRendered.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], overscanRowCount = overscanRowCount.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowGetter = rowGetter.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any], rowStyle = rowStyle.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArialabelAutoHeight]
  }
}

