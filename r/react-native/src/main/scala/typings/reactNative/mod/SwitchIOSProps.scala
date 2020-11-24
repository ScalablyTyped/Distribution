package typings.reactNative.mod

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
  implicit class SwitchIOSPropsOps[Self <: SwitchIOSProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnTintColor(value: ColorValue): Self = this.set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTintColor: Self = this.set("onTintColor", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Boolean => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: ColorValue): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
