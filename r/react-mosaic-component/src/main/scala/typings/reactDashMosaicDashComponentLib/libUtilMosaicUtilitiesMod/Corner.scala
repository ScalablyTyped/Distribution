package typings
package reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Corner extends js.Object

@JSImport("react-mosaic-component/lib/util/mosaicUtilities", "Corner")
@js.native
object Corner extends js.Object {
  @js.native
  sealed trait BOTTOM_LEFT
    extends reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod.Corner
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod.Corner
  
  @js.native
  sealed trait TOP_LEFT
    extends reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod.Corner
  
  @js.native
  sealed trait TOP_RIGHT
    extends reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod.Corner
  
  /* 3 */ val BOTTOM_LEFT: BOTTOM_LEFT with scala.Double = js.native
  /* 4 */ val BOTTOM_RIGHT: BOTTOM_RIGHT with scala.Double = js.native
  /* 1 */ val TOP_LEFT: TOP_LEFT with scala.Double = js.native
  /* 2 */ val TOP_RIGHT: TOP_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashMosaicDashComponentLib.libUtilMosaicUtilitiesMod.Corner with scala.Double
  ] = js.native
}

