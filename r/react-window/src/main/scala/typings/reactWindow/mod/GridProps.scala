package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.reactWindow.anon.ColumnIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends CommonProps {
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: ComponentType[GridChildComponentProps]
  /**
    * Number of columns in the grid. Note that only a few columns will be rendered and displayed at a time.
    */
  var columnCount: Double
  /**
    * Determines the direction of text and horizontal scrolling.
    *
    * This property also automatically sets the CSS direction style for the grid component.
    *
    * @default "ltr"
    */
  var direction: js.UndefOr[CSSDirection] = js.undefined
  /**
    * Height of the grid. This affects the number of rows that will be rendered (and displayed) at any given time.
    */
  var height: Double
  /**
    * Horizontal scroll offset for initial render.
    */
  var initialScrollLeft: js.UndefOr[Double] = js.undefined
  /**
    * Vertical scroll offset for initial render.
    */
  var initialScrollTop: js.UndefOr[Double] = js.undefined
  /**
    * By default, grids will use an item's indices as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your grid does not satisfy the above constraints, use the itemKey property to specify your own keys for items.
    */
  var itemKey: js.UndefOr[GridItemKeySelector] = js.undefined
  /**
    * Called when the items rendered by the grid change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ GridOnItemsRenderedProps, _]] = js.undefined
  /**
    * Called when the grid scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ GridOnScrollProps, _]] = js.undefined
  /**
    * The number of columns to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanColumnCount: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated since version 1.8.2, please use overscanColumnCount
    */
  var overscanColumnsCount: js.UndefOr[Double] = js.undefined
  /**
    * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    *
    * @deprecated since version 1.4.0
    */
  var overscanCount: js.UndefOr[Double] = js.undefined
  /**
    * The number of rows to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated since version 1.8.2, please use overscanRowCount
    */
  var overscanRowsCount: js.UndefOr[Double] = js.undefined
  /**
    * Number of rows in the grid. Note that only a few rows will be rendered and displayed at a time.
    */
  var rowCount: Double
  /**
    * Width of the grid. This affects the number of columns that will be rendered (and displayed) at any given time.
    */
  var width: Double
}

object GridProps {
  @scala.inline
  def apply(
    children: ComponentType[GridChildComponentProps],
    columnCount: Double,
    height: Double,
    rowCount: Double,
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
  ): GridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GridProps]
  }
}

