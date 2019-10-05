package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.Global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
class FOV protected () extends js.Object {
  def this(lightPassesCallback: LightPassesCallback) = this()
  def this(lightPassesCallback: LightPassesCallback, options: FOVOptions) = this()
  def compute(x: Double, y: Double, R: Double, callback: FOVCallback): Unit = js.native
}

@JSImport("rot-js", "FOV")
@js.native
object FOV extends js.Object {
  @js.native
  class DiscreteShadowcasting () extends FOV
  
  @js.native
  class PreciseShadowcasting () extends FOV
  
  @js.native
  class RecursiveShadowcasting () extends FOV {
    def compute180(x: Double, y: Double, R: Double, dir: Double, callback: FOVCallback): Unit = js.native
    def compute90(x: Double, y: Double, R: Double, dir: Double, callback: FOVCallback): Unit = js.native
  }
  
  @js.native
  object RecursiveShadowcasting extends js.Object {
    val OCTANTS: Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  }
  
}

