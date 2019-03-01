package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBox extends js.Object {
  var cx: scala.Double
  var cy: scala.Double
  var h: scala.Double
  var height: scala.Double
  var path: scala.Double
  var r0: scala.Double
  var r1: scala.Double
  var r2: scala.Double
  var vb: java.lang.String
  var w: scala.Double
  var width: scala.Double
  var x: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y2: scala.Double
}

object BBox {
  @scala.inline
  def apply(
    cx: scala.Double,
    cy: scala.Double,
    h: scala.Double,
    height: scala.Double,
    path: scala.Double,
    r0: scala.Double,
    r1: scala.Double,
    r2: scala.Double,
    vb: java.lang.String,
    w: scala.Double,
    width: scala.Double,
    x: scala.Double,
    x2: scala.Double,
    y: scala.Double,
    y2: scala.Double
  ): BBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cx")(cx)
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("r0")(r0)
    __obj.updateDynamic("r1")(r1)
    __obj.updateDynamic("r2")(r2)
    __obj.updateDynamic("vb")(vb)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[BBox]
  }
}

