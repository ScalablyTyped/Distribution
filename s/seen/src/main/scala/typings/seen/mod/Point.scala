package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Point")
@js.native
class Point () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def add(q: Point): this.type = js.native
  def copy(): this.type = js.native
  def cross(q: Point): this.type = js.native
  def divide(n: Double): this.type = js.native
  def dot(q: Point): Double = js.native
  def magnitude(): Double = js.native
  def magnitudeSquared(): Double = js.native
  def multiply(n: Double): this.type = js.native
  def normalize(): this.type = js.native
  def perpendicular(): this.type = js.native
  def round(): this.type = js.native
  def set(p: Point): this.type = js.native
  def subtract(q: Point): this.type = js.native
  def transform(matrix: Matrix): this.type = js.native
  def translate(x: Double, y: Double, z: Double): this.type = js.native
}

