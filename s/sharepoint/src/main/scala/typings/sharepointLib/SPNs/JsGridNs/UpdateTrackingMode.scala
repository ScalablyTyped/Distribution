package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateTrackingMode extends js.Object

@JSGlobal("SP.JsGrid.UpdateTrackingMode")
@js.native
object UpdateTrackingMode extends js.Object {
  @js.native
  sealed trait PropBoth
    extends sharepointLib.SPNs.JsGridNs.UpdateTrackingMode
  
   // 2,
  @js.native
  sealed trait PropData
    extends sharepointLib.SPNs.JsGridNs.UpdateTrackingMode
  
   // 3,
  @js.native
  sealed trait PropLocalized
    extends sharepointLib.SPNs.JsGridNs.UpdateTrackingMode
  
  /* 2 */ val PropBoth: PropBoth with scala.Double = js.native
  /* 0 */ val PropData: PropData with scala.Double = js.native
  /* 1 */ val PropLocalized: PropLocalized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.UpdateTrackingMode with scala.Double] = js.native
}

