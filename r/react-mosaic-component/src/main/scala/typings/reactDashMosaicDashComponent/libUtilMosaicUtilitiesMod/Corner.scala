package typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Corner extends js.Object

@JSImport("react-mosaic-component/lib/util/mosaicUtilities", "Corner")
@js.native
object Corner extends js.Object {
  @js.native
  sealed trait BOTTOM_LEFT extends Corner
  
  @js.native
  sealed trait BOTTOM_RIGHT extends Corner
  
  @js.native
  sealed trait TOP_LEFT extends Corner
  
  @js.native
  sealed trait TOP_RIGHT extends Corner
  
  /* 3 */ val BOTTOM_LEFT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_LEFT with Double = js.native
  /* 4 */ val BOTTOM_RIGHT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_RIGHT with Double = js.native
  /* 1 */ val TOP_LEFT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.TOP_LEFT with Double = js.native
  /* 2 */ val TOP_RIGHT: typings.reactDashMosaicDashComponent.libUtilMosaicUtilitiesMod.Corner.TOP_RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Corner with Double] = js.native
}

