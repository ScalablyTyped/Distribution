package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Transformable")
@js.native
class Transformable () extends js.Object {
  var baked: js.Array[scala.Double] = js.native
  var m: Matrix = js.native
  def bake(): this.type = js.native
  def bake(m: js.Array[scala.Double]): this.type = js.native
  def matrix(m: js.Array[scala.Double]): this.type = js.native
  def reset(): this.type = js.native
  def rotx(theta: scala.Double): this.type = js.native
  def roty(theta: scala.Double): this.type = js.native
  def rotz(theta: scala.Double): this.type = js.native
  def scale(): this.type = js.native
  def scale(x: scala.Double): this.type = js.native
  def scale(x: scala.Double, y: scala.Double): this.type = js.native
  def scale(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
  def transform(m: Matrix): this.type = js.native
  def translate(): this.type = js.native
  def translate(x: scala.Double): this.type = js.native
  def translate(x: scala.Double, y: scala.Double): this.type = js.native
  def translate(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
}

