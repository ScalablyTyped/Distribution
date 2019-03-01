package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBHSB extends js.Object {
  var b: scala.Double
  var error: scala.Boolean
  var g: scala.Double
  var h: scala.Double
  var hex: java.lang.String
  var l: scala.Double
  var r: scala.Double
  var s: scala.Double
  var v: scala.Double
}

object RGBHSB {
  @scala.inline
  def apply(
    b: scala.Double,
    error: scala.Boolean,
    g: scala.Double,
    h: scala.Double,
    hex: java.lang.String,
    l: scala.Double,
    r: scala.Double,
    s: scala.Double,
    v: scala.Double
  ): RGBHSB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[RGBHSB]
  }
}

