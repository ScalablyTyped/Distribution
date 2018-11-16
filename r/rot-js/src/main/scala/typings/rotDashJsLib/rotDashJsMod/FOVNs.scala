package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
object FOVNs extends js.Object {
  @js.native
  class DiscreteShadowcasting ()
    extends rotDashJsLib.rotDashJsMod.FOV
  
  @js.native
  class PreciseShadowcasting ()
    extends rotDashJsLib.rotDashJsMod.FOV
  
  @js.native
  class RecursiveShadowcasting ()
    extends rotDashJsLib.rotDashJsMod.FOV {
    def compute180(
      x: scala.Double,
      y: scala.Double,
      R: scala.Double,
      dir: scala.Double,
      callback: rotDashJsLib.rotDashJsMod.FOVCallback
    ): scala.Unit = js.native
    def compute90(
      x: scala.Double,
      y: scala.Double,
      R: scala.Double,
      dir: scala.Double,
      callback: rotDashJsLib.rotDashJsMod.FOVCallback
    ): scala.Unit = js.native
  }
  
  @JSName("RecursiveShadowcasting")
  @js.native
  object RecursiveShadowcastingNs extends js.Object {
    val OCTANTS: rotDashJsLib.rotDashJsMod.Global.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.native
  }
  
}

