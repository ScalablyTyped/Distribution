package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.rotDashJs.libNoiseSimplexMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Noise")
@js.native
object Noise extends js.Object {
  @js.native
  /**
    * @param gradients Random gradients
    */
  class Simplex () extends default {
    def this(gradients: Double) = this()
  }
  
  @js.native
  object Simplex
    extends TopLevel[Instantiable1[js.UndefOr[/* gradients */ Double], default]]
  
}

