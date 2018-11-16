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
  
  val PropBoth: PropBoth with java.lang.String = js.native
  val PropData: PropData with java.lang.String = js.native
  val PropLocalized: PropLocalized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.UpdateTrackingMode with java.lang.String] = js.native
}

