package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitTransform extends js.Object {
  var dx: Double = js.native
  var dy: Double = js.native
  var isSimple: Boolean = js.native
  var rotate: Double = js.native
  var scalex: Double = js.native
  var scaley: Double = js.native
  var shear: Double = js.native
}

object ExplicitTransform {
  @scala.inline
  def apply(
    dx: Double,
    dy: Double,
    isSimple: Boolean,
    rotate: Double,
    scalex: Double,
    scaley: Double,
    shear: Double
  ): ExplicitTransform = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], isSimple = isSimple.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scalex = scalex.asInstanceOf[js.Any], scaley = scaley.asInstanceOf[js.Any], shear = shear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitTransform]
  }
  @scala.inline
  implicit class ExplicitTransformOps[Self <: ExplicitTransform] (val x: Self) extends AnyVal {
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
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSimple(value: Boolean): Self = this.set("isSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalex(value: Double): Self = this.set("scalex", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaley(value: Double): Self = this.set("scaley", value.asInstanceOf[js.Any])
    @scala.inline
    def setShear(value: Double): Self = this.set("shear", value.asInstanceOf[js.Any])
  }
  
}

