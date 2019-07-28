package typings.snapsvg.snapsvgMod

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
    val __obj = js.Dynamic.literal(b = b, error = error, g = g, h = h, hex = hex, l = l, r = r, s = s, v = v)
  
    __obj.asInstanceOf[RGBHSB]
  }
}

