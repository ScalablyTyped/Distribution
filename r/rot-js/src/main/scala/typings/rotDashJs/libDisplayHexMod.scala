package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/display/hex", JSImport.Namespace)
@js.native
object libDisplayHexMod extends js.Object {
  @js.native
  trait Hex
    extends typings.rotDashJs.libDisplayCanvasMod.default {
    var _hexSize: Double = js.native
    var _spacingX: Double = js.native
    var _spacingY: Double = js.native
    /**
      * Arguments are pixel values. If "transposed" mode is enabled, then these two are already swapped.
      */
    def _fill(cx: Double, cy: Double): Unit = js.native
  }
  
  @js.native
  class default () extends Hex
  
}

