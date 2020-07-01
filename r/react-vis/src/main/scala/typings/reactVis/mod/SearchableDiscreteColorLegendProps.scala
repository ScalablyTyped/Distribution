package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactChild
import typings.reactVis.anon.Color
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchableDiscreteColorLegendProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
   // default: ''
  var items: js.Array[Color | String | ReactChild]
  var onItemClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  var onItemMouseEnter: js.UndefOr[RVItemEventHandler] = js.undefined
  var onItemMouseLeave: js.UndefOr[RVItemEventHandler] = js.undefined
   // default: ''
  var onSearchChange: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.undefined
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  var searchFn: js.UndefOr[js.Function2[/* items */ js.Array[_], /* s */ String, js.Array[_]]] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var searchText: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SearchableDiscreteColorLegendProps {
  @scala.inline
  def apply(
    items: js.Array[Color | String | ReactChild],
    className: String = null,
    height: js.UndefOr[Double] = js.undefined,
    onItemClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onItemMouseEnter: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onItemMouseLeave: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onSearchChange: /* x */ js.Any => _ = null,
    orientation: vertical | horizontal = null,
    searchFn: (/* items */ js.Array[_], /* s */ String) => js.Array[_] = null,
    searchPlaceholder: String = null,
    searchText: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SearchableDiscreteColorLegendProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onItemMouseEnter != null) __obj.updateDynamic("onItemMouseEnter")(js.Any.fromFunction3(onItemMouseEnter))
    if (onItemMouseLeave != null) __obj.updateDynamic("onItemMouseLeave")(js.Any.fromFunction3(onItemMouseLeave))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1(onSearchChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (searchFn != null) __obj.updateDynamic("searchFn")(js.Any.fromFunction2(searchFn))
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableDiscreteColorLegendProps]
  }
}

