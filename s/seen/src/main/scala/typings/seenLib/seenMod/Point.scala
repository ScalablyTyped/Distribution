package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Point")
@js.native
class Point () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def add(q: Point): this.type = js.native
  def copy(): this.type = js.native
  def cross(q: Point): this.type = js.native
  def divide(n: scala.Double): this.type = js.native
  def dot(q: Point): scala.Double = js.native
  def magnitude(): scala.Double = js.native
  def magnitudeSquared(): scala.Double = js.native
  def multiply(n: scala.Double): this.type = js.native
  def normalize(): this.type = js.native
  def perpendicular(): this.type = js.native
  def round(): this.type = js.native
  def set(p: Point): this.type = js.native
  def subtract(q: Point): this.type = js.native
  def transform(matrix: Matrix): this.type = js.native
  def translate(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
}

