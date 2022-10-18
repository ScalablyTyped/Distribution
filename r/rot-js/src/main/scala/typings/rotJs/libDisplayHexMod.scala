package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayHexMod {
  
  @JSImport("rot-js/lib/display/hex", JSImport.Default)
  @js.native
  open class default () extends Hex
  
  @js.native
  trait Hex
    extends typings.rotJs.libDisplayCanvasMod.default {
    
    /**
      * Arguments are pixel values. If "transposed" mode is enabled, then these two are already swapped.
      */
    def _fill(cx: Double, cy: Double): Unit = js.native
    
    var _hexSize: Double = js.native
    
    var _spacingX: Double = js.native
    
    var _spacingY: Double = js.native
  }
}
