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

trait DiscreteColorLegendProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  // default: ''
  var items: js.Array[Color | String | ReactChild]
  
  var onItemClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onItemMouseEnter: js.UndefOr[RVItemEventHandler] = js.undefined
  
  var onItemMouseLeave: js.UndefOr[RVItemEventHandler] = js.undefined
  
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiscreteColorLegendProps {
  
  inline def apply(items: js.Array[Color | String | ReactChild]): DiscreteColorLegendProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscreteColorLegendProps]
  }
  
  extension [Self <: DiscreteColorLegendProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setItems(value: js.Array[Color | String | ReactChild]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (Color | String | ReactChild)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setOnItemClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemMouseEnter(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onItemMouseEnter", js.Any.fromFunction3(value))
    
    inline def setOnItemMouseEnterUndefined: Self = StObject.set(x, "onItemMouseEnter", js.undefined)
    
    inline def setOnItemMouseLeave(
      value: (/* item */ js.Any, /* index */ Double, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onItemMouseLeave", js.Any.fromFunction3(value))
    
    inline def setOnItemMouseLeaveUndefined: Self = StObject.set(x, "onItemMouseLeave", js.undefined)
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
