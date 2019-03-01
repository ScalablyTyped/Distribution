package typings
package scrollrevealLib.scrollRevealNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollRevealRotateObject extends js.Object {
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
  var z: js.UndefOr[scala.Double] = js.undefined
}

object ScrollRevealRotateObject {
  @scala.inline
  def apply(
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): ScrollRevealRotateObject = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRevealRotateObject]
  }
}

