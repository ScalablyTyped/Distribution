package typings.reactSpring.renderpropsUniversalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringConfig extends js.Object {
  var clamp: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[SpringEasingFunc] = js.native
  var friction: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var precision: js.UndefOr[Double] = js.native
  var tension: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object SpringConfig {
  @scala.inline
  def apply(): SpringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringConfig]
  }
  @scala.inline
  implicit class SpringConfigOps[Self <: SpringConfig] (val x: Self) extends AnyVal {
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
    def setClamp(value: Boolean): Self = this.set("clamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClamp: Self = this.set("clamp", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* t */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

