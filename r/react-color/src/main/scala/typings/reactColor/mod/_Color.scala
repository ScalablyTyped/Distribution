package typings.reactColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Color extends js.Object

object _Color {
  @scala.inline
  def HSLColor(h: Double, l: Double, s: Double): _Color = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  @scala.inline
  def RGBColor(b: Double, g: Double, r: Double): _Color = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
}

