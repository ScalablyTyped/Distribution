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
  
  @scala.inline
  def apply(): PickerIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerIOSProps]
  }
  
  @scala.inline
  implicit class PickerIOSPropsMutableBuilder[Self <: PickerIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ String | Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: String | Double): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
  }
}
