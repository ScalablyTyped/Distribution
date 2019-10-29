package typings.rotDashJs

import typings.rotDashJs.libFovDiscreteDashShadowcastingMod.DiscreteShadowcasting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/fov/discrete-shadowcasting", JSImport.Namespace)
@js.native
object libFovDiscreteDashShadowcastingMod extends js.Object {
  @js.native
  trait DiscreteShadowcasting
    extends typings.rotDashJs.libFovFovMod.default {
    /**
      * @param {int} A start angle
      * @param {int} B end angle
      * @param {bool} blocks Does current cell block visibility?
      * @param {int[][]} DATA shadowed angle pairs
      */
    def _visibleCoords(A: Double, B: Double, blocks: Boolean, DATA: js.Array[Double]): Boolean = js.native
  }
  
  @js.native
  class default () extends DiscreteShadowcasting
  
}

