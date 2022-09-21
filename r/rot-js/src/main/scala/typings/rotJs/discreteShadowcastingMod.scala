package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discreteShadowcastingMod {
  
  @JSImport("rot-js/lib/fov/discrete-shadowcasting", JSImport.Default)
  @js.native
  open class default () extends DiscreteShadowcasting
  
  @js.native
  trait DiscreteShadowcasting
    extends typings.rotJs.fovFovMod.default {
    
    /**
      * @param {int} A start angle
      * @param {int} B end angle
      * @param {bool} blocks Does current cell block visibility?
      * @param {int[][]} DATA shadowed angle pairs
      */
    def _visibleCoords(A: Double, B: Double, blocks: Boolean, DATA: js.Array[Double]): Boolean = js.native
  }
}
