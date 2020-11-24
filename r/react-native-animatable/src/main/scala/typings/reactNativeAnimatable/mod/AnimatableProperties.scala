package typings.reactNativeAnimatable.mod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatableProperties[S /* <: js.Object */] extends js.Object {
  
  var animation: js.UndefOr[Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[Direction] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[Easing] = js.native
  
  var iterationCount: js.UndefOr[Double | infinite] = js.native
  
  var iterationDelay: js.UndefOr[Double] = js.native
  
  var onAnimationBegin: js.UndefOr[js.Function] = js.native
  
  var onAnimationEnd: js.UndefOr[js.Function] = js.native
  
  var onTransitionBegin: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.native
  
  var onTransitionEnd: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.native
  
  var transition: js.UndefOr[(/* keyof S */ String) | (js.Array[/* keyof S */ String])] = js.native
  
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}
object AnimatableProperties {
  
  @scala.inline
  def apply[S /* <: js.Object */](): AnimatableProperties[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatableProperties[S]]
  }
  
  @scala.inline
  implicit class AnimatablePropertiesOps[Self <: AnimatableProperties[_], S /* <: js.Object */] (val x: Self with AnimatableProperties[S]) extends AnyVal {
    
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
    def setAnimation(value: Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasingFunction1(value: /* t */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setIterationCount(value: Double | infinite): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationCount: Self = this.set("iterationCount", js.undefined)
    
    @scala.inline
    def setIterationDelay(value: Double): Self = this.set("iterationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationDelay: Self = this.set("iterationDelay", js.undefined)
    
    @scala.inline
    def setOnAnimationBegin(value: js.Function): Self = this.set("onAnimationBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationBegin: Self = this.set("onAnimationBegin", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: js.Function): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionBegin(value: /* property */ String => Unit): Self = this.set("onTransitionBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionBegin: Self = this.set("onTransitionBegin", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: /* property */ String => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setTransitionVarargs(value: (/* keyof S */ String)*): Self = this.set("transition", js.Array(value :_*))
    
    @scala.inline
    def setTransition(value: (/* keyof S */ String) | (js.Array[/* keyof S */ String])): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
  }
}
