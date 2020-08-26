package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringVelocityScale extends js.Object {
  var springVelocityScale: Double = js.native
  var swipeVelocityImpact: Double = js.native
}

object SpringVelocityScale {
  @scala.inline
  def apply(springVelocityScale: Double, swipeVelocityImpact: Double): SpringVelocityScale = {
    val __obj = js.Dynamic.literal(springVelocityScale = springVelocityScale.asInstanceOf[js.Any], swipeVelocityImpact = swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringVelocityScale]
  }
  @scala.inline
  implicit class SpringVelocityScaleOps[Self <: SpringVelocityScale] (val x: Self) extends AnyVal {
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
    def setSpringVelocityScale(value: Double): Self = this.set("springVelocityScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeVelocityImpact(value: Double): Self = this.set("swipeVelocityImpact", value.asInstanceOf[js.Any])
  }
  
}

