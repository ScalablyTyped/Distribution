package typings.reactNativeOnboardingSwiper.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipButtonProps extends js.Object {
  
  var allowFontScaling: Boolean = js.native
  
  var isLight: Boolean = js.native
  
  def onPress(): js.Any = js.native
  
  var skipLabel: String | Element = js.native
}
object SkipButtonProps {
  
  @scala.inline
  def apply(allowFontScaling: Boolean, isLight: Boolean, onPress: () => js.Any, skipLabel: String | Element): SkipButtonProps = {
    val __obj = js.Dynamic.literal(allowFontScaling = allowFontScaling.asInstanceOf[js.Any], isLight = isLight.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress), skipLabel = skipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipButtonProps]
  }
  
  @scala.inline
  implicit class SkipButtonPropsOps[Self <: SkipButtonProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSkipLabel(value: String | Element): Self = this.set("skipLabel", value.asInstanceOf[js.Any])
  }
}
