package typings.reactNative.mod

import typings.reactNative.anon.False
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchProps extends SwitchPropsIOS {
  
  /**
    * If true the user won't be able to toggle the switch.
    * Default value is false.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * On iOS, custom color for the background.
    * Can be seen when the switch value is false or when the switch is disabled.
    */
  var ios_backgroundColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Invoked with the new value when the value changes.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
  
  /**
    * Color of the foreground switch grip.
    */
  var thumbColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Custom colors for the switch track
    *
    * Color when false and color when true
    */
  var trackColor: js.UndefOr[False] = js.native
  
  /**
    * The value of the switch. If true the switch will be turned on.
    * Default value is false.
    */
  var value: js.UndefOr[Boolean] = js.native
}
object SwitchProps {
  
  @scala.inline
  def apply(): SwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
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
    def setIos_backgroundColor(value: ColorValue): Self = this.set("ios_backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos_backgroundColor: Self = this.set("ios_backgroundColor", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Boolean => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setThumbColor(value: ColorValue): Self = this.set("thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbColor: Self = this.set("thumbColor", js.undefined)
    
    @scala.inline
    def setTrackColor(value: False): Self = this.set("trackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackColor: Self = this.set("trackColor", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
