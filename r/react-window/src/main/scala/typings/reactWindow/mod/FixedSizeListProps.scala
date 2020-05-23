package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.Ref
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
    initialScrollOffset: js.UndefOr[Double] = js.undefined,
    innerElementType: ReactElementType = null,
    innerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: (/* index */ Double, /* data */ js.Any) => Key = null,
    layout: Layout = null,
    onItemsRendered: /* props */ ListOnItemsRenderedProps => _ = null,
    onScroll: /* props */ ListOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    outerTagName: String = null,
    overscanCount: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined
  ): FixedSizeListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(initialScrollOffset)) __obj.updateDynamic("initialScrollOffset")(initialScrollOffset.get.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction2(itemKey))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (!js.isUndefined(outerRef)) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (!js.isUndefined(overscanCount)) __obj.updateDynamic("overscanCount")(overscanCount.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeListProps]
  }
}

