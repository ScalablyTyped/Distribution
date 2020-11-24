package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Simplex3D")
@js.native
class Simplex3D () extends js.Object {
  def this(seed: Double) = this()
  
  var gradP: js.Array[Grad] = js.native
  
  def noise(x: Double, y: Double, z: Double): Double = js.native
  
  var perm: js.Array[Double] = js.native
  
  def seed(seed: Double): Unit = js.native
}
