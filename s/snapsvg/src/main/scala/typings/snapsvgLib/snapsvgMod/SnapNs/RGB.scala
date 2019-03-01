package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var b: scala.Double
  var g: scala.Double
  var hex: java.lang.String
  var r: scala.Double
}

object RGB {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, hex: java.lang.String, r: scala.Double): RGB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[RGB]
  }
}

