package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckBoxProps
  extends StObject
     with ViewProps {
  
  /**
    * If true the user won't be able to toggle the checkbox. Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used in case the props change removes the component.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.undefined
  
  /**
    * Invoked with the new value when the value changes.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.undefined
  
  /**
    * The value of the checkbox. If true the checkbox will be turned on. Default value is false.
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object CheckBoxProps {
  
  inline def apply(): CheckBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  extension [Self <: CheckBoxProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
