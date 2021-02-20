package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchIOSProps extends ViewProps {
  
  /**
    * If true the user won't be able to toggle the switch. Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Background color when the switch is turned on.
    */
  var onTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Callback that is called when the user toggles the switch.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
  
  /**
    * Background color for the switch round button.
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Background color when the switch is turned off.
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The value of the switch, if true the switch will be turned on. Default value is false.
    */
  var value: js.UndefOr[Boolean] = js.native
}
object SwitchIOSProps {
  
  @scala.inline
  def apply(): SwitchIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchIOSProps]
  }
  
  @scala.inline
  implicit class SwitchIOSPropsMutableBuilder[Self <: SwitchIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnTintColor(value: ColorValue): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: ColorValue): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
