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

@js.native
trait SearchableDiscreteColorLegendProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
   // default: ''
  var items: js.Array[Color | String | ReactChild] = js.native
  var onItemClick: js.UndefOr[RVMouseEventHandler] = js.native
  var onItemMouseEnter: js.UndefOr[RVItemEventHandler] = js.native
  var onItemMouseLeave: js.UndefOr[RVItemEventHandler] = js.native
   // default: ''
  var onSearchChange: js.UndefOr[js.Function1[/* x */ js.Any, _]] = js.native
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  var searchFn: js.UndefOr[js.Function2[/* items */ js.Array[_], /* s */ String, js.Array[_]]] = js.native
  var searchPlaceholder: js.UndefOr[String] = js.native
  var searchText: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SearchableDiscreteColorLegendProps {
  @scala.inline
  def apply(items: js.Array[Color | String | ReactChild]): SearchableDiscreteColorLegendProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableDiscreteColorLegendProps]
  }
  @scala.inline
  implicit class SearchableDiscreteColorLegendPropsOps[Self <: SearchableDiscreteColorLegendProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: (Color | String | ReactChild)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Color | String | ReactChild]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnItemClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnItemMouseEnter(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemMouseEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemMouseEnter: Self = this.set("onItemMouseEnter", js.undefined)
    @scala.inline
    def setOnItemMouseLeave(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onItemMouseLeave", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemMouseLeave: Self = this.set("onItemMouseLeave", js.undefined)
    @scala.inline
    def setOnSearchChange(value: /* x */ js.Any => _): Self = this.set("onSearchChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearchChange: Self = this.set("onSearchChange", js.undefined)
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSearchFn(value: (/* items */ js.Array[_], /* s */ String) => js.Array[_]): Self = this.set("searchFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSearchFn: Self = this.set("searchFn", js.undefined)
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

