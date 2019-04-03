package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends CommonProps {
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: reactLib.reactMod.ReactNs.ComponentType[GridChildComponentProps]
  /**
    * Number of columns in the grid. Note that only a few columns will be rendered and displayed at a time.
    */
  var columnCount: scala.Double
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
  var height: scala.Double
  /**
    * Horizontal scroll offset for initial render.
    */
  var initialScrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical scroll offset for initial render.
    */
  var initialScrollTop: js.UndefOr[scala.Double] = js.undefined
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
  var overscanColumnsCount: js.UndefOr[scala.Double] = js.undefined
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
  var overscanCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of rows to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanRowsCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of rows in the grid. Note that only a few rows will be rendered and displayed at a time.
    */
  var rowCount: scala.Double
  /**
    * Width of the grid. This affects the number of columns that will be rendered (and displayed) at any given time.
    */
  var width: scala.Double
}

object GridProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ComponentType[GridChildComponentProps],
    columnCount: scala.Double,
    height: scala.Double,
    rowCount: scala.Double,
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
  ): GridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount, height = height, rowCount = rowCount, width = width)
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
    __obj.asInstanceOf[GridProps]
  }
}

