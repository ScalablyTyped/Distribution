package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Transformable")
@js.native
class Transformable () extends js.Object {
  var baked: js.Array[Double] = js.native
  var m: Matrix = js.native
  def bake(): this.type = js.native
  def bake(m: js.Array[Double]): this.type = js.native
  def matrix(m: js.Array[Double]): this.type = js.native
  def reset(): this.type = js.native
  def rotx(theta: Double): this.type = js.native
  def roty(theta: Double): this.type = js.native
  def rotz(theta: Double): this.type = js.native
  def scale(): this.type = js.native
  def scale(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): this.type = js.native
  def scale(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def scale(x: js.UndefOr[scala.Nothing], y: Double, z: Double): this.type = js.native
  def scale(x: Double): this.type = js.native
  def scale(x: Double, y: js.UndefOr[scala.Nothing], z: Double): this.type = js.native
  def scale(x: Double, y: Double): this.type = js.native
  def scale(x: Double, y: Double, z: Double): this.type = js.native
  def transform(m: Matrix): this.type = js.native
  def translate(): this.type = js.native
  def translate(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): this.type = js.native
  def translate(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def translate(x: js.UndefOr[scala.Nothing], y: Double, z: Double): this.type = js.native
  def translate(x: Double): this.type = js.native
  def translate(x: Double, y: js.UndefOr[scala.Nothing], z: Double): this.type = js.native
  def translate(x: Double, y: Double): this.type = js.native
  def translate(x: Double, y: Double, z: Double): this.type = js.native
}

