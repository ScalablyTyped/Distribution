package typings
package reactDashColorLib.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLColor extends _Color {
  var a: js.UndefOr[scala.Double] = js.undefined
  var h: scala.Double
  var l: scala.Double
  var s: scala.Double
}

object HSLColor {
  @scala.inline
  def apply(h: scala.Double, l: scala.Double, s: scala.Double, a: scala.Int | scala.Double = null): HSLColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("s")(s)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLColor]
  }
}

