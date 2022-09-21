package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiDotMarking
  extends StObject
     with Marking {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dots: js.Array[CalendarDot]
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var selectedColor: js.UndefOr[String] = js.undefined
}
object MultiDotMarking {
  
  inline def apply(dots: js.Array[CalendarDot]): MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDotMarking]
  }
  
  extension [Self <: MultiDotMarking](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDots(value: js.Array[CalendarDot]): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsVarargs(value: CalendarDot*): Self = StObject.set(x, "dots", js.Array(value*))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
