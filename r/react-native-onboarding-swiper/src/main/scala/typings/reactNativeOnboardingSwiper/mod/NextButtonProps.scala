package typings.reactNativeOnboardingSwiper.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextButtonProps extends js.Object {
  
  var allowFontScaling: Boolean = js.native
  
  var isLight: Boolean = js.native
  
  var nextLabel: String | Element = js.native
  
  def onPress(): js.Any = js.native
}
object NextButtonProps {
  
  @scala.inline
  def apply(allowFontScaling: Boolean, isLight: Boolean, nextLabel: String | Element, onPress: () => js.Any): NextButtonProps = {
    val __obj = js.Dynamic.literal(allowFontScaling = allowFontScaling.asInstanceOf[js.Any], isLight = isLight.asInstanceOf[js.Any], nextLabel = nextLabel.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[NextButtonProps]
  }
  
  @scala.inline
  implicit class NextButtonPropsOps[Self <: NextButtonProps] (val x: Self) extends AnyVal {
    
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
    def setNextLabel(value: String | Element): Self = this.set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: () => js.Any): Self = this.set("onPress", js.Any.fromFunction0(value))
  }
}
