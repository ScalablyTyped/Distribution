package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dx extends js.Object {
  var dx: Double
  var dy: Double
  var isSimple: Boolean
  var rotate: Double
  var scalex: Double
  var scaley: Double
  var shear: Double
}

object Anon_Dx {
  @scala.inline
  def apply(
    dx: Double,
    dy: Double,
    isSimple: Boolean,
    rotate: Double,
    scalex: Double,
    scaley: Double,
    shear: Double
  ): Anon_Dx = {
    val __obj = js.Dynamic.literal(dx = dx, dy = dy, isSimple = isSimple, rotate = rotate, scalex = scalex, scaley = scaley, shear = shear)
  
    __obj.asInstanceOf[Anon_Dx]
  }
}

