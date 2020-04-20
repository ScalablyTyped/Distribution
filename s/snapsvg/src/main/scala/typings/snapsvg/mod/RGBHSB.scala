package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBHSB extends js.Object {
  var b: Double
  var error: Boolean
  var g: Double
  var h: Double
  var hex: String
  var l: Double
  var r: Double
  var s: Double
  var v: Double
}

object RGBHSB {
  @scala.inline
  def apply(
    b: Double,
    error: Boolean,
    g: Double,
    h: Double,
    hex: String,
    l: Double,
    r: Double,
    s: Double,
    v: Double
  ): RGBHSB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBHSB]
  }
}

