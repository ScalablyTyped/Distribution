package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBox extends js.Object {
  var cx: Double
  var cy: Double
  var h: Double
  var height: Double
  var path: Double
  var r0: Double
  var r1: Double
  var r2: Double
  var vb: String
  var w: Double
  var width: Double
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
}

object BBox {
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    h: Double,
    height: Double,
    path: Double,
    r0: Double,
    r1: Double,
    r2: Double,
    vb: String,
    w: Double,
    width: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): BBox = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, h = h, height = height, path = path, r0 = r0, r1 = r1, r2 = r2, vb = vb, w = w, width = width, x = x, x2 = x2, y = y, y2 = y2)
  
    __obj.asInstanceOf[BBox]
  }
}

