package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplicitTransform extends js.Object {
  var dx: scala.Double
  var dy: scala.Double
  var isSimple: scala.Boolean
  var rotate: scala.Double
  var scalex: scala.Double
  var scaley: scala.Double
  var shear: scala.Double
}

object ExplicitTransform {
  @scala.inline
  def apply(
    dx: scala.Double,
    dy: scala.Double,
    isSimple: scala.Boolean,
    rotate: scala.Double,
    scalex: scala.Double,
    scaley: scala.Double,
    shear: scala.Double
  ): ExplicitTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dx")(dx)
    __obj.updateDynamic("dy")(dy)
    __obj.updateDynamic("isSimple")(isSimple)
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("scalex")(scalex)
    __obj.updateDynamic("scaley")(scaley)
    __obj.updateDynamic("shear")(shear)
    __obj.asInstanceOf[ExplicitTransform]
  }
}

