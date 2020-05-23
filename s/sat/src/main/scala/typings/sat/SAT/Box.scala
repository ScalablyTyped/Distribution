package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  var h: Double
  var pos: Vector
  var w: Double
  def toPolygon(): Polygon
}

object Box {
  @scala.inline
  def apply(h: Double, pos: Vector, toPolygon: () => Polygon, w: Double): Box = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], toPolygon = js.Any.fromFunction0(toPolygon), w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
}

