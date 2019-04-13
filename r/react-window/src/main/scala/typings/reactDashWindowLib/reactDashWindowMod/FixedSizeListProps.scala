package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedSizeListProps extends ListProps {
  /**
    * Size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    */
  var itemSize: scala.Double
}

object FixedSizeListProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ComponentType[ListChildComponentProps],
    height: scala.Double | java.lang.String,
    itemCount: scala.Double,
    itemSize: scala.Double,
    width: scala.Double | java.lang.String,
    className: java.lang.String = null,
    direction: CSSDirection | Direction = null,
    initialScrollOffset: scala.Int | scala.Double = null,
    innerElementType: ReactElementType = null,
    innerRef: reactLib.reactMod.Ref[_] = null,
    innerTagName: java.lang.String = null,
    itemData: js.Any = null,
    itemKey: ListItemKeySelector = null,
    layout: Layout = null,
    onItemsRendered: /* props */ ListOnItemsRenderedProps => _ = null,
    onScroll: /* props */ ListOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: reactLib.reactMod.Ref[_] = null,
    outerTagName: java.lang.String = null,
    overscanCount: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    useIsScrolling: js.UndefOr[scala.Boolean] = js.undefined
  ): FixedSizeListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount, itemSize = itemSize, width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (initialScrollOffset != null) __obj.updateDynamic("initialScrollOffset")(initialScrollOffset.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName)
    if (itemData != null) __obj.updateDynamic("itemData")(itemData)
    if (itemKey != null) __obj.updateDynamic("itemKey")(itemKey)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName)
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling)
    __obj.asInstanceOf[FixedSizeListProps]
  }
}

