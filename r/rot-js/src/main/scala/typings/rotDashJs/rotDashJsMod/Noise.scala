package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  def get(x: Double, y: Double): Double
}

@JSImport("rot-js", "Noise")
@js.native
object Noise extends js.Object {
  @js.native
  class Simplex () extends Noise {
    def this(gradients: Double) = this()
    /* CompleteClass */
    override def get(x: Double, y: Double): Double = js.native
  }
  
}

