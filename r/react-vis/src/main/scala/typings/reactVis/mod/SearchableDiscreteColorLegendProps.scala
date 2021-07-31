package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactChild
import typings.reactVis.anon.Color
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableDiscreteColorLegendProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  // default: ''
  var items: js.Array[Color | String | ReactChild]
  
  var onItemClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onItemMouseEnter: js.UndefOr[RVItemEventHandler] = js.undefined
  
  var onItemMouseLeave: js.UndefOr[RVItemEventHandler] = js.undefined
  
  // default: ''
  var onSearchChange: js.UndefOr[js.Function1[/* x */ js.Any, js.Any]] = js.undefined
  
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  var searchFn: js.UndefOr[js.Function2[/* items */ js.Array[js.Any], /* s */ String, js.Array[js.Any]]] = js.undefined
  
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SearchableDiscreteColorLegendProps {
  
  @scala.inline
  def apply(items: js.Array[Color | String | ReactChild]): SearchableDiscreteColorLegendProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableDiscreteColorLegendProps]
  }
  
  @scala.inline
  implicit class SearchableDiscreteColorLegendPropsMutableBuilder[Self <: SearchableDiscreteColorLegendProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Color | String | ReactChild]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: (Color | String | ReactChild)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOnItemClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemMouseEnter(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onItemMouseEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemMouseEnterUndefined: Self = StObject.set(x, "onItemMouseEnter", js.undefined)
    
    @scala.inline
    def setOnItemMouseLeave(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onItemMouseLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnItemMouseLeaveUndefined: Self = StObject.set(x, "onItemMouseLeave", js.undefined)
    
    @scala.inline
    def setOnSearchChange(value: /* x */ js.Any => js.Any): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSearchFn(value: (/* items */ js.Array[js.Any], /* s */ String) => js.Array[js.Any]): Self = StObject.set(x, "searchFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchFnUndefined: Self = StObject.set(x, "searchFn", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
