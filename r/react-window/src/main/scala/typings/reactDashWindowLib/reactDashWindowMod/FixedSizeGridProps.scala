package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedSizeGridProps extends GridProps {
  /**
    * Width of an individual column within the grid.
    */
  var columnWidth: scala.Double
  /**
    * Height of an individual row within the grid.
    */
  var rowHeight: scala.Double
}

object FixedSizeGridProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ComponentType[GridChildComponentProps],
    columnCount: scala.Double,
    columnWidth: scala.Double,
    height: scala.Double,
    rowCount: scala.Double,
    rowHeight: scala.Double,
    width: scala.Double,
    className: java.lang.String = null,
    direction: CSSDirection = null,
    initialScrollLeft: scala.Int | scala.Double = null,
    initialScrollTop: scala.Int | scala.Double = null,
    innerElementType: ReactElementType = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null,
    innerTagName: java.lang.String = null,
    itemData: js.Any = null,
    itemKey: GridItemKeySelector = null,
    onItemsRendered: /* props */ GridOnItemsRenderedProps => _ = null,
    onScroll: /* props */ GridOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: reactLib.reactMod.ReactNs.Ref[_] = null,
    outerTagName: java.lang.String = null,
    overscanColumnsCount: scala.Int | scala.Double = null,
    overscanCount: scala.Int | scala.Double = null,
    overscanRowsCount: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useIsScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): FixedSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount, columnWidth = columnWidth, height = height, rowCount = rowCount, rowHeight = rowHeight, width = width)
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
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
    __obj.asInstanceOf[FixedSizeGridProps]
  }
}

