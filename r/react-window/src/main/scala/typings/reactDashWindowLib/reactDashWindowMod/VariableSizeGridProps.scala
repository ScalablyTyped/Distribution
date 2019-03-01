package typings
package reactDashWindowLib.reactDashWindowMod

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
  var estimatedColumnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Average (or estimated) row height for unrendered rows.
    *
    * This value is used to calculated the estimated total height of a Grid before its rows have all been measured.
    * The estimated height impacts user scrolling behavior. It is updated whenever new rows are measured.
    */
  var estimatedRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Returns the width of the specified column.
    */
  def columnWidth(index: scala.Double): scala.Double
  /**
    * Returns the height of the specified row.
    */
  def rowHeight(index: scala.Double): scala.Double
}

object VariableSizeGridProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ComponentType[GridChildComponentProps],
    columnCount: scala.Double,
    columnWidth: js.Function1[scala.Double, scala.Double],
    height: scala.Double,
    rowCount: scala.Double,
    rowHeight: js.Function1[scala.Double, scala.Double],
    width: scala.Double,
    className: java.lang.String = null,
    estimatedColumnWidth: scala.Int | scala.Double = null,
    estimatedRowHeight: scala.Int | scala.Double = null,
    initialScrollLeft: scala.Int | scala.Double = null,
    initialScrollTop: scala.Int | scala.Double = null,
    innerElementType: ReactElementType = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null,
    innerTagName: java.lang.String = null,
    itemData: js.Any = null,
    itemKey: GridItemKeySelector = null,
    onItemsRendered: js.Function1[/* props */ GridOnItemsRenderedProps, _] = null,
    onScroll: js.Function1[/* props */ GridOnScrollProps, _] = null,
    outerElementType: ReactElementType = null,
    outerRef: reactLib.reactMod.ReactNs.Ref[_] = null,
    outerTagName: java.lang.String = null,
    overscanColumnsCount: scala.Int | scala.Double = null,
    overscanCount: scala.Int | scala.Double = null,
    overscanRowsCount: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useIsScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): VariableSizeGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("columnCount")(columnCount)
    __obj.updateDynamic("columnWidth")(columnWidth)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("rowCount")(rowCount)
    __obj.updateDynamic("rowHeight")(rowHeight)
    __obj.updateDynamic("width")(width)
    if (className != null) __obj.updateDynamic("className")(className)
    if (estimatedColumnWidth != null) __obj.updateDynamic("estimatedColumnWidth")(estimatedColumnWidth.asInstanceOf[js.Any])
    if (estimatedRowHeight != null) __obj.updateDynamic("estimatedRowHeight")(estimatedRowHeight.asInstanceOf[js.Any])
    if (initialScrollLeft != null) __obj.updateDynamic("initialScrollLeft")(initialScrollLeft.asInstanceOf[js.Any])
    if (initialScrollTop != null) __obj.updateDynamic("initialScrollTop")(initialScrollTop.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData)
    if (itemKey != null) __obj.updateDynamic("itemKey")(itemKey)
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(onItemsRendered)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
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

