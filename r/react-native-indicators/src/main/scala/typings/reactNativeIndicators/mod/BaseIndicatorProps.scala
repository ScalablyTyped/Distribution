package typings.reactNativeIndicators.mod

import typings.reactNative.mod.EasingFunction
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseIndicatorProps extends js.Object {
  
  /**
    * Animation toggle
    * @default true
    */
  var animating: js.UndefOr[Boolean] = js.native
  
  /**
    * Animation duration in ms
    * @default 1200
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Animation easing function
    * @default Easing.linear
    */
  var animationEasing: js.UndefOr[EasingFunction] = js.native
  
  /**
    * Hide when not animating
    * @default true
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.native
  
  /**
    * Animation is interaction
    * @default true
    */
  var interaction: js.UndefOr[Boolean] = js.native
  
  /**
    * Style is proxied to the underlying View
    * @default undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object BaseIndicatorProps {
  
  @scala.inline
  def apply(): BaseIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseIndicatorProps]
  }
  
  @scala.inline
  implicit class BaseIndicatorPropsOps[Self <: BaseIndicatorProps] (val x: Self) extends AnyVal {
    
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
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: /* value */ Double => Double): Self = this.set("animationEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    
    @scala.inline
    def setHidesWhenStopped(value: Boolean): Self = this.set("hidesWhenStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidesWhenStopped: Self = this.set("hidesWhenStopped", js.undefined)
    
    @scala.inline
    def setInteraction(value: Boolean): Self = this.set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteraction: Self = this.set("interaction", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
