package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Noise")
@js.native
object NoiseNs extends js.Object {
  @js.native
  class Simplex () extends Noise {
    def this(gradients: Double) = this()
    /* CompleteClass */
    override def get(x: Double, y: Double): Double = js.native
  }
  
}

