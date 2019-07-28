package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadOnlyActiveState extends js.Object

@JSGlobal("SP.JsGrid.ReadOnlyActiveState")
@js.native
object ReadOnlyActiveState extends js.Object {
   // 0,
  @js.native
  sealed trait ReadOnlyActive extends ReadOnlyActiveState
  
   // 1
  @js.native
  sealed trait ReadOnlyDisabled extends ReadOnlyActiveState
  
  /* 0 */ val ReadOnlyActive: typings.sharepoint.SPNs.JsGridNs.ReadOnlyActiveState.ReadOnlyActive with Double = js.native
  /* 1 */ val ReadOnlyDisabled: typings.sharepoint.SPNs.JsGridNs.ReadOnlyActiveState.ReadOnlyDisabled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadOnlyActiveState with Double] = js.native
}

