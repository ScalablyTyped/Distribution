package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimingAnimationConfig extends AnimationConfig {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  var toValue: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation = js.native
}

object TimingAnimationConfig {
  @scala.inline
  def apply(
    toValue: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation,
    useNativeDriver: Boolean
  ): TimingAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingAnimationConfig]
  }
  @scala.inline
  implicit class TimingAnimationConfigOps[Self <: TimingAnimationConfig] (val x: Self) extends AnyVal {
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
    def setToValue(value: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation): Self = this.set("toValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* value */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
  
}

