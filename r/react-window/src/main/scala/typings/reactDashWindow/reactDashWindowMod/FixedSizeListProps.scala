package typings.reactDashWindow.reactDashWindowMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Key
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedSizeListProps extends ListProps {
  /**
    * Size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    */
  var itemSize: Double
}

object FixedSizeListProps {
  @scala.inline
  def apply(
    children: ComponentType[ListChildComponentProps],
    height: Double | String,
    itemCount: Double,
    itemSize: Double,
    width: Double | String,
    className: String = null,
    direction: CSSDirection | Direction = null,
    initialScrollOffset: Int | Double = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref[_] = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: (/* index */ Double, /* data */ js.Any) => Key = null,
    layout: Layout = null,
    onItemsRendered: /* props */ ListOnItemsRenderedProps => _ = null,
    onScroll: /* props */ ListOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref[_] = null,
    outerTagName: String = null,
    overscanCount: Int | Double = null,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined
  ): FixedSizeListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (initialScrollOffset != null) __obj.updateDynamic("initialScrollOffset")(initialScrollOffset.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction2(itemKey))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeListProps]
  }
}

