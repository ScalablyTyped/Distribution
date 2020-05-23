package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.reactWindow.anon.ColumnIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedSizeGridProps extends GridProps {
  /**
    * Width of an individual column within the grid.
    */
  var columnWidth: Double
  /**
    * Height of an individual row within the grid.
    */
  var rowHeight: Double
}

object FixedSizeGridProps {
  @scala.inline
  def apply(
    children: ComponentType[GridChildComponentProps],
    columnCount: Double,
    columnWidth: Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double,
    width: Double,
    className: String = null,
    direction: CSSDirection = null,
    initialScrollLeft: js.UndefOr[Double] = js.undefined,
    initialScrollTop: js.UndefOr[Double] = js.undefined,
    innerElementType: ReactElementType = null,
    innerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: /* params */ ColumnIndex => Key = null,
    onItemsRendered: /* props */ GridOnItemsRenderedProps => _ = null,
    onScroll: /* props */ GridOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    outerTagName: String = null,
    overscanColumnCount: js.UndefOr[Double] = js.undefined,
    overscanColumnsCount: js.UndefOr[Double] = js.undefined,
    overscanCount: js.UndefOr[Double] = js.undefined,
    overscanRowCount: js.UndefOr[Double] = js.undefined,
    overscanRowsCount: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined
  ): FixedSizeGridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(initialScrollLeft)) __obj.updateDynamic("initialScrollLeft")(initialScrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialScrollTop)) __obj.updateDynamic("initialScrollTop")(initialScrollTop.get.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction1(itemKey))
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (!js.isUndefined(outerRef)) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanColumnCount)) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanColumnsCount)) __obj.updateDynamic("overscanColumnsCount")(overscanColumnsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanCount)) __obj.updateDynamic("overscanCount")(overscanCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanRowCount)) __obj.updateDynamic("overscanRowCount")(overscanRowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanRowsCount)) __obj.updateDynamic("overscanRowsCount")(overscanRowsCount.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeGridProps]
  }
}

