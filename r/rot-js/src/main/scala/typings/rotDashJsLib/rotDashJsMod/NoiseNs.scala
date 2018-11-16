package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Noise")
@js.native
object NoiseNs extends js.Object {
  @js.native
  class Simplex ()
    extends rotDashJsLib.rotDashJsMod.Noise {
    def this(gradients: scala.Double) = this()
    /* CompleteClass */
    override def get(x: scala.Double, y: scala.Double): scala.Double = js.native
  }
  
}

