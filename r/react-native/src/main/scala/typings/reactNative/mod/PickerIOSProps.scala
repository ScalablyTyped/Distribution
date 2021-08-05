package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerIOSProps
  extends StObject
     with ViewProps {
  
  var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.undefined
  
  var selectedValue: js.UndefOr[String | Double] = js.undefined
}
object PickerIOSProps {
  
  inline def apply(): PickerIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerIOSProps]
  }
  
  extension [Self <: PickerIOSProps](x: Self) {
    
    inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setOnValueChange(value: /* value */ String | Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setSelectedValue(value: String | Double): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
  }
}
