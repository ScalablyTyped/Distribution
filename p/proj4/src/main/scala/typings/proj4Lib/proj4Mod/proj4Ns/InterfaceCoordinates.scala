package typings
package proj4Lib.proj4Mod.proj4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceCoordinates extends js.Object {
  var m: js.UndefOr[scala.Double] = js.undefined
  var x: scala.Double
  var y: scala.Double
  var z: js.UndefOr[scala.Double] = js.undefined
}

object InterfaceCoordinates {
  @scala.inline
  def apply(
    x: scala.Double,
    y: scala.Double,
    m: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): InterfaceCoordinates = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceCoordinates]
  }
}

