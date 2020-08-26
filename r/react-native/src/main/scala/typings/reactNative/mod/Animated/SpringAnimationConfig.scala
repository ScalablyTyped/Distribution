package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringAnimationConfig extends AnimationConfig {
  var bounciness: js.UndefOr[Double] = js.native
  var damping: js.UndefOr[Double] = js.native
  var delay: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var overshootClamping: js.UndefOr[Boolean] = js.native
  var restDisplacementThreshold: js.UndefOr[Double] = js.native
  var restSpeedThreshold: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var tension: js.UndefOr[Double] = js.native
  var toValue: Double | AnimatedValue | X | AnimatedValueXY = js.native
  var velocity: js.UndefOr[Double | X] = js.native
}

object SpringAnimationConfig {
  @scala.inline
  def apply(toValue: Double | AnimatedValue | X | AnimatedValueXY, useNativeDriver: Boolean): SpringAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringAnimationConfig]
  }
  @scala.inline
  implicit class SpringAnimationConfigOps[Self <: SpringAnimationConfig] (val x: Self) extends AnyVal {
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
    def setToValue(value: Double | AnimatedValue | X | AnimatedValueXY): Self = this.set("toValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounciness(value: Double): Self = this.set("bounciness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounciness: Self = this.set("bounciness", js.undefined)
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setOvershootClamping(value: Boolean): Self = this.set("overshootClamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOvershootClamping: Self = this.set("overshootClamping", js.undefined)
    @scala.inline
    def setRestDisplacementThreshold(value: Double): Self = this.set("restDisplacementThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestDisplacementThreshold: Self = this.set("restDisplacementThreshold", js.undefined)
    @scala.inline
    def setRestSpeedThreshold(value: Double): Self = this.set("restSpeedThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeedThreshold: Self = this.set("restSpeedThreshold", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
    @scala.inline
    def setVelocity(value: Double | X): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

