package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchIOSProps
  extends StObject
     with ViewProps {
  
  /**
    * If true the user won't be able to toggle the switch. Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Background color when the switch is turned on.
    */
  var onTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Callback that is called when the user toggles the switch.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.undefined
  
  /**
    * Background color for the switch round button.
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Background color when the switch is turned off.
    */
  var tintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * The value of the switch, if true the switch will be turned on. Default value is false.
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object SwitchIOSProps {
  
  inline def apply(): SwitchIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchIOSProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchIOSProps] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnTintColor(value: ColorValue): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    inline def setOnValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
