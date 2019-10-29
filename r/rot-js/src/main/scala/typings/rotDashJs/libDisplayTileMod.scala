package typings.rotDashJs

import typings.rotDashJs.libDisplayTileMod.Tile
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/display/tile", JSImport.Namespace)
@js.native
object libDisplayTileMod extends js.Object {
  @js.native
  trait Tile
    extends typings.rotDashJs.libDisplayCanvasMod.default {
    var _colorCanvas: HTMLCanvasElement = js.native
    def computeFontSize(): Double = js.native
  }
  
  @js.native
  class default () extends Tile
  
}

