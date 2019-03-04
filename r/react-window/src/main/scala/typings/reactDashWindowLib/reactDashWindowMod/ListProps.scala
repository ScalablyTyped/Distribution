package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends CommonProps {
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: reactLib.reactMod.ReactNs.ComponentType[ListChildComponentProps]
  /**
    * Primary scroll direction of the list. Acceptable values are:
    *
    * - vertical (default) - Up/down scrolling.
    * - horizontal - Left/right scrolling.
    *
    * Note that lists may scroll in both directions (depending on CSS) but content will only be windowed in the primary direction.
    */
  var direction: js.UndefOr[Direction] = js.undefined
  /**
    * Height of the list.
    *
    * For vertical lists, this must be a number. It affects the number of rows that will be rendered (and displayed) at any given time.
    *
    * For horizontal lists, this can be a number or a string (e.g. "50%").
    */
  var height: scala.Double | java.lang.String
  /**
    * Scroll offset for initial render.
    *
    * For vertical lists, this affects scrollTop. For horizontal lists, this affects scrollLeft.
    */
  var initialScrollOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Total number of items in the list. Note that only a few items will be rendered and displayed at a time.
    */
  var itemCount: scala.Double
  /**
    * By default, lists will use an item's index as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your list does not satisfy the above constraints, use the itemKey property to specify your own keys for items
    */
  var itemKey: js.UndefOr[ListItemKeySelector] = js.undefined
  /**
    * Called when the items rendered by the list change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ ListOnItemsRenderedProps, _]] = js.undefined
  /**
    * Called when the list scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ ListOnScrollProps, _]] = js.undefined
  /**
    * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, List overscans by one item.
    */
  var overscanCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of the list.
    *
    * For horizontal lists, this must be a number. It affects the number of columns that will be rendered (and displayed) at any given time.
    *
    * For vertical lists, this can be a number or a string (e.g. "50%").
    */
  var width: scala.Double | java.lang.String
}

object ListProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ComponentType[ListChildComponentProps],
    height: scala.Double | java.lang.String,
    itemCount: scala.Double,
    width: scala.Double | java.lang.String,
    className: java.lang.String = null,
    direction: Direction = null,
    initialScrollOffset: scala.Int | scala.Double = null,
    innerElementType: ReactElementType = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null,
    innerTagName: java.lang.String = null,
    itemData: js.Any = null,
    itemKey: ListItemKeySelector = null,
    onItemsRendered: js.Function1[/* props */ ListOnItemsRenderedProps, _] = null,
    onScroll: js.Function1[/* props */ ListOnScrollProps, _] = null,
    outerElementType: ReactElementType = null,
    outerRef: reactLib.reactMod.ReactNs.Ref[_] = null,
    outerTagName: java.lang.String = null,
    overscanCount: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useIsScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): ListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount, width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (initialScrollOffset != null) __obj.updateDynamic("initialScrollOffset")(initialScrollOffset.asInstanceOf[js.Any])
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
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling)
    __obj.asInstanceOf[ListProps]
  }
}

