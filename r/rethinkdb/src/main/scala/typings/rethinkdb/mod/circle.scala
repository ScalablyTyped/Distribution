package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", "circle")
@js.native
object circle extends js.Object {
  def apply(point: Point_, radius: Double): Geometry = js.native
  def apply(point: Point_, radius: Double, options: CircleOptions): Geometry = js.native
}

