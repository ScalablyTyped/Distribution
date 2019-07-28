package typings.sat.SATNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT.Box")
@js.native
class Box () extends js.Object {
  def this(pos: Vector) = this()
  def this(pos: Vector, width: Double) = this()
  def this(pos: Vector, width: Double, height: Double) = this()
  var h: Double = js.native
  var pos: Vector = js.native
  var w: Double = js.native
  def toPolygon(): Polygon = js.native
}

