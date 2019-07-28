package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateTrackingMode extends js.Object

@JSGlobal("SP.JsGrid.UpdateTrackingMode")
@js.native
object UpdateTrackingMode extends js.Object {
  @js.native
  sealed trait PropBoth extends UpdateTrackingMode
  
   // 2,
  @js.native
  sealed trait PropData extends UpdateTrackingMode
  
   // 3,
  @js.native
  sealed trait PropLocalized extends UpdateTrackingMode
  
  /* 2 */ val PropBoth: typings.sharepoint.SPNs.JsGridNs.UpdateTrackingMode.PropBoth with Double = js.native
  /* 0 */ val PropData: typings.sharepoint.SPNs.JsGridNs.UpdateTrackingMode.PropData with Double = js.native
  /* 1 */ val PropLocalized: typings.sharepoint.SPNs.JsGridNs.UpdateTrackingMode.PropLocalized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpdateTrackingMode with Double] = js.native
}

