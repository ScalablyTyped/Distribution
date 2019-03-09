package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Surface")
@js.native
class Surface protected () extends js.Object {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], painter: Painter) = this()
  var cullBackfaces: scala.Boolean = js.native
  var dirty: scala.Boolean | scala.Null = js.native
  var fillMaterial: Material = js.native
  var id: java.lang.String = js.native
  var painter: Painter = js.native
  var points: js.Array[Point] = js.native
  var strokeMaterial: Material = js.native
  def fill(fill: java.lang.String): this.type = js.native
  def fill(fill: Color): this.type = js.native
  def stroke(stroke: java.lang.String): this.type = js.native
  def stroke(stroke: Color): this.type = js.native
}

