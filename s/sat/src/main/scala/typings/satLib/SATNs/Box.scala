package typings
package satLib.SATNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT.Box")
@js.native
class Box () extends js.Object {
  def this(pos: Vector) = this()
  def this(pos: Vector, width: scala.Double) = this()
  def this(pos: Vector, width: scala.Double, height: scala.Double) = this()
  var h: scala.Double = js.native
  var pos: Vector = js.native
  var w: scala.Double = js.native
  def toPolygon(): Polygon = js.native
}

