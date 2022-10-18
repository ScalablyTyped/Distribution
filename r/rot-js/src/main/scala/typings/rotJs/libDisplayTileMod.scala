package typings.rotJs

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayTileMod {
  
  @JSImport("rot-js/lib/display/tile", JSImport.Default)
  @js.native
  open class default () extends Tile
  
  @js.native
  trait Tile
    extends typings.rotJs.libDisplayCanvasMod.default {
    
    var _colorCanvas: HTMLCanvasElement = js.native
    
    def computeFontSize(): Double = js.native
  }
}
