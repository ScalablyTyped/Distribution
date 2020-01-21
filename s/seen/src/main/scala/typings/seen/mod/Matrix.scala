package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Matrix")
@js.native
class Matrix () extends js.Object {
  def this(m: js.Array[Double]) = this()
  var baked: js.Array[Double] = js.native
  var m: js.Array[Double] = js.native
  def bake(): this.type = js.native
  def bake(m: js.Array[Double]): this.type = js.native
  def copy(): this.type = js.native
  def matrix(m: js.Array[Double]): this.type = js.native
  def multiply(b: Matrix): this.type = js.native
  def reset(): this.type = js.native
  def rotx(theta: Double): this.type = js.native
  def roty(theta: Double): this.type = js.native
  def rotz(theta: Double): this.type = js.native
  def scale(): this.type = js.native
  def scale(x: Double): this.type = js.native
  def scale(x: Double, y: Double): this.type = js.native
  def scale(x: Double, y: Double, z: Double): this.type = js.native
  def translate(): this.type = js.native
  def translate(x: Double): this.type = js.native
  def translate(x: Double, y: Double): this.type = js.native
  def translate(x: Double, y: Double, z: Double): this.type = js.native
  def transpose(): this.type = js.native
}

