package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplicitTransform extends js.Object {
  var dx: Double
  var dy: Double
  var isSimple: Boolean
  var rotate: Double
  var scalex: Double
  var scaley: Double
  var shear: Double
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
    val __obj = js.Dynamic.literal(dx = dx, dy = dy, isSimple = isSimple, rotate = rotate, scalex = scalex, scaley = scaley, shear = shear)
  
    __obj.asInstanceOf[ExplicitTransform]
  }
}

