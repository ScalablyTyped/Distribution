package typings.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import typings.rotDashJs.TypeofClassRect
import typings.rotDashJs.TypeofClassTileGL
import typings.rotDashJs.libDisplayDisplayMod.default
import typings.rotDashJs.libDisplayTypesMod.DisplayOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Display")
@js.native
class Display () extends default {
  def this(options: Partial[DisplayOptions]) = this()
}

/* static members */
@JSImport("rot-js", "Display")
@js.native
object Display extends js.Object {
  var Hex: Instantiable0[typings.rotDashJs.libDisplayHexMod.default] = js.native
  var Rect: TypeofClassRect = js.native
  var Term: Instantiable0[typings.rotDashJs.libDisplayTermMod.default] = js.native
  var Tile: Instantiable0[typings.rotDashJs.libDisplayTileMod.default] = js.native
  var TileGL: TypeofClassTileGL = js.native
}

