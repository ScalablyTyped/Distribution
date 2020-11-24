package typings.reactNativeOnboardingSwiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoneButtonProps extends js.Object {
  
  var allowFontScaling: Boolean = js.native
  
  var isLight: Boolean = js.native
  
  def onPress(): js.Any = js.native
}
object DoneButtonProps {
  
  @scala.inline
  def apply(allowFontScaling: Boolean, isLight: Boolean, onPress: () => js.Any): DoneButtonProps = {
    val __obj = js.Dynamic.literal(allowFontScaling = allowFontScaling.asInstanceOf[js.Any], isLight = isLight.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[DoneButtonProps]
  }
  
  @scala.inline
  implicit class DoneButtonPropsOps[Self <: DoneButtonProps] (val x: Self) extends AnyVal {
    
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
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLight(value: Boolean): Self = this.set("isLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: () => js.Any): Self = this.set("onPress", js.Any.fromFunction0(value))
  }
}
