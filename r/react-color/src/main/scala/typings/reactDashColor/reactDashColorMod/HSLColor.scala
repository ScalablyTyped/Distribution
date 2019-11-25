package typings.reactDashColor.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLColor extends _Color {
  var a: js.UndefOr[Double] = js.undefined
  var h: Double
  var l: Double
  var s: Double
}

object HSLColor {
  @scala.inline
  def apply(h: Double, l: Double, s: Double, a: Int | Double = null): HSLColor = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLColor]
  }
}

