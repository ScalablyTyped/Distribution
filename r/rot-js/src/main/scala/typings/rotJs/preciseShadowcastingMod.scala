package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preciseShadowcastingMod {
  
  @JSImport("rot-js/lib/fov/precise-shadowcasting", JSImport.Default)
  @js.native
  class default () extends PreciseShadowcasting
  
  type Arc = js.Tuple2[Double, Double]
  
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
}
