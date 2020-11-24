package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleWithAnimatedValue extends js.Object {
  
  var style: WithAnimatedValue[StyleProp[ViewStyle]] = js.native
}
object StyleWithAnimatedValue {
  
  @scala.inline
  def apply(): StyleWithAnimatedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleWithAnimatedValue]
  }
  
  @scala.inline
  implicit class StyleWithAnimatedValueOps[Self <: StyleWithAnimatedValue] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
