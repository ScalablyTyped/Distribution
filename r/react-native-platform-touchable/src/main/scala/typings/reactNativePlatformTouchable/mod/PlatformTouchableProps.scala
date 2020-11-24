package typings.reactNativePlatformTouchable.mod

import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformTouchableProps extends TouchableWithoutFeedbackProps {
  
  // TouchableOpacity (default iOS)
  var activeOpacity: js.UndefOr[Double] = js.native
  
  // TouchableNativeFeedback (default Android)
  var background: js.UndefOr[BackgroundPropType] = js.native
  
  var foreground: js.UndefOr[BackgroundPropType] = js.native
  
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  // TouchableHighlight
  var underlayColor: js.UndefOr[String] = js.native
}
object PlatformTouchableProps {
  
  @scala.inline
  def apply(): PlatformTouchableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformTouchableProps]
  }
  
  @scala.inline
  implicit class PlatformTouchablePropsOps[Self <: PlatformTouchableProps] (val x: Self) extends AnyVal {
    
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setForeground(value: BackgroundPropType): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = this.set("onHideUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = this.set("onShowUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
}
