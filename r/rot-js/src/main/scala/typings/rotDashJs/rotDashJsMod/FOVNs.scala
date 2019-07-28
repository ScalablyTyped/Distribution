package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.Global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
object FOVNs extends js.Object {
  @js.native
  class DiscreteShadowcasting () extends FOV
  
  @js.native
  class PreciseShadowcasting () extends FOV
  
  @js.native
  class RecursiveShadowcasting () extends FOV {
    def compute180(x: Double, y: Double, R: Double, dir: Double, callback: FOVCallback): Unit = js.native
    def compute90(x: Double, y: Double, R: Double, dir: Double, callback: FOVCallback): Unit = js.native
  }
  
  @JSName("RecursiveShadowcasting")
  @js.native
  object RecursiveShadowcastingNs extends js.Object {
    val OCTANTS: Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  }
  
}

