package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchPropsIOS extends ViewProps {
  
  /**
    * Background color when the switch is turned on.
    *
    * @deprecated use trackColor instead
    */
  var onTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Color of the foreground switch grip.
    *
    * @deprecated use thumbColor instead
    */
  var thumbTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Background color when the switch is turned off.
    *
    * @deprecated use trackColor instead
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
}
object SwitchPropsIOS {
  
  @scala.inline
  def apply(): SwitchPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchPropsIOS]
  }
  
  @scala.inline
  implicit class SwitchPropsIOSOps[Self <: SwitchPropsIOS] (val x: Self) extends AnyVal {
    
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
    def setOnTintColor(value: ColorValue): Self = this.set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTintColor: Self = this.set("onTintColor", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: ColorValue): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
