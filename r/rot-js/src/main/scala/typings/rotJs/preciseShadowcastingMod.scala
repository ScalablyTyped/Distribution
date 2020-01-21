package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/fov/precise-shadowcasting", JSImport.Namespace)
@js.native
object preciseShadowcastingMod extends js.Object {
  @js.native
  trait PreciseShadowcasting
    extends typings.rotJs.fovFovMod.default {
    /**
      * @param {int[2]} A1 arc start
      * @param {int[2]} A2 arc end
      * @param {bool} blocks Does current arc block visibility?
      * @param {int[][]} SHADOWS list of active shadows
      */
    def _checkVisibility(A1: Arc, A2: Arc, blocks: Boolean, SHADOWS: js.Array[Arc]): Double = js.native
  }
  
  @js.native
  class default () extends PreciseShadowcasting
  
  type Arc = js.Tuple2[Double, Double]
}

