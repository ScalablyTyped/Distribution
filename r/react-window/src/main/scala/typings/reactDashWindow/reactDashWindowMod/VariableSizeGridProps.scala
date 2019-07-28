package typings.reactDashWindow.reactDashWindowMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableSizeGridProps extends GridProps {
  /**
    * Average (or estimated) column width for unrendered columns.
    *
    * This value is used to calculated the estimated total width of a Grid before its columns have all been measured.
    * The estimated width impacts user scrolling behavior. It is updated whenever new columns are measured.
    */
  var estimatedColumnWidth: js.UndefOr[Double] = js.undefined
  /**
    * Average (or estimated) row height for unrendered rows.
    *
    * This value is used to calculated the estimated total height of a Grid before its rows have all been measured.
    * The estimated height impacts user scrolling behavior. It is updated whenever new rows are measured.
    */
  var estimatedRowHeight: js.UndefOr[Double] = js.undefined
  /**
    * Returns the width of the specified column.
    */
  def columnWidth(index: Double): Double
  /**
    * Returns the height of the specified row.
    */
  def rowHeight(index: Double): Double
}

object VariableSizeGridProps {
  @scala.inline
  def apply(
    children: ComponentType[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double,
    className: String = null,
    direction: CSSDirection = null,
    estimatedColumnWidth: Int | Double = null,
    estimatedRowHeight: Int | Double = null,
    initialScrollLeft: Int | Double = null,
    initialScrollTop: Int | Double = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref[_] = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: GridItemKeySelector = null,
    onItemsRendered: /* props */ GridOnItemsRenderedProps => _ = null,
    onScroll: /* props */ GridOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref[_] = null,
    outerTagName: String = null,
    overscanColumnsCount: Int | Double = null,
    overscanCount: Int | Double = null,
    overscanRowsCount: Int | Double = null,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined
  ): VariableSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount, columnWidth = js.Any.fromFunction1(columnWidth), height = height, rowCount = rowCount, rowHeight = js.Any.fromFunction1(rowHeight), width = width)
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (estimatedColumnWidth != null) __obj.updateDynamic("estimatedColumnWidth")(estimatedColumnWidth.asInstanceOf[js.Any])
    if (estimatedRowHeight != null) __obj.updateDynamic("estimatedRowHeight")(estimatedRowHeight.asInstanceOf[js.Any])
    if (initialScrollLeft != null) __obj.updateDynamic("initialScrollLeft")(initialScrollLeft.asInstanceOf[js.Any])
    if (initialScrollTop != null) __obj.updateDynamic("initialScrollTop")(initialScrollTop.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData)
    if (itemKey != null) __obj.updateDynamic("itemKey")(itemKey)
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName)
    if (overscanColumnsCount != null) __obj.updateDynamic("overscanColumnsCount")(overscanColumnsCount.asInstanceOf[js.Any])
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (overscanRowsCount != null) __obj.updateDynamic("overscanRowsCount")(overscanRowsCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling)
    __obj.asInstanceOf[VariableSizeGridProps]
  }
}

