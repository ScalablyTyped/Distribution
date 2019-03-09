package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Simplex3D")
@js.native
class Simplex3D () extends js.Object {
  def this(seed: scala.Double) = this()
  var gradP: js.Array[Grad] = js.native
  var perm: js.Array[scala.Double] = js.native
  def noise(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  def seed(seed: scala.Double): scala.Unit = js.native
}

