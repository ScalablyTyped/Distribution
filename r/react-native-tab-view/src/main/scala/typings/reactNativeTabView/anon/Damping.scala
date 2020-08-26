package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Damping extends js.Object {
  var damping: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var restDisplacementThreshold: js.UndefOr[Double] = js.native
  var restSpeedThreshold: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
}

object Damping {
  @scala.inline
  def apply(): Damping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Damping]
  }
  @scala.inline
  implicit class DampingOps[Self <: Damping] (val x: Self) extends AnyVal {
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
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setRestDisplacementThreshold(value: Double): Self = this.set("restDisplacementThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestDisplacementThreshold: Self = this.set("restDisplacementThreshold", js.undefined)
    @scala.inline
    def setRestSpeedThreshold(value: Double): Self = this.set("restSpeedThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeedThreshold: Self = this.set("restSpeedThreshold", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
  }
  
}

