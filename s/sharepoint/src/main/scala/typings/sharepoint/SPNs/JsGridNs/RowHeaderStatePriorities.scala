package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowHeaderStatePriorities extends js.Object

@JSGlobal("SP.JsGrid.RowHeaderStatePriorities")
@js.native
object RowHeaderStatePriorities extends js.Object {
   // 40,
  @js.native
  sealed trait CellError extends RowHeaderStatePriorities
  
   // 50,
  @js.native
  sealed trait Conflict extends RowHeaderStatePriorities
  
   // 10,
  @js.native
  sealed trait Dirty extends RowHeaderStatePriorities
  
  @js.native
  sealed trait NewRow extends RowHeaderStatePriorities
  
   // 60,
  @js.native
  sealed trait RowError extends RowHeaderStatePriorities
  
   // 30,
  @js.native
  sealed trait Transfer extends RowHeaderStatePriorities
  
  /* 2 */ val CellError: typings.sharepoint.SPNs.JsGridNs.RowHeaderStatePriorities.CellError with Double = js.native
  /* 3 */ val Conflict: typings.sharepoint.SPNs.JsGridNs.RowHeaderStatePriorities.Conflict with Double = js.native
  /* 0 */ val Dirty: typings.sharepoint.SPNs.JsGridNs.RowHeaderStatePriorities.Dirty with Double = js.native
  /* 5 */ val NewRow: typings.sharepoint.SPNs.JsGridNs.RowHeaderStatePriorities.NewRow with Double = js.native
  /* 4 */ val RowError: typings.sharepoint.SPNs.JsGridNs.RowHeaderStatePriorities.RowError with Double = js.native
  /* 1 */ val Transfer: typings.sharepoint.SPNs.JsGridNs.RowHeaderStatePriorities.Transfer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowHeaderStatePriorities with Double] = js.native
}

