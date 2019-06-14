package typings
package sharepointLib.SPNs.JsGridNs

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
  sealed trait CellError
    extends sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities
  
   // 50,
  @js.native
  sealed trait Conflict
    extends sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities
  
   // 10,
  @js.native
  sealed trait Dirty
    extends sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities
  
  @js.native
  sealed trait NewRow
    extends sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities
  
   // 60,
  @js.native
  sealed trait RowError
    extends sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities
  
   // 30,
  @js.native
  sealed trait Transfer
    extends sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities
  
  /* 2 */ val CellError: CellError with scala.Double = js.native
  /* 3 */ val Conflict: Conflict with scala.Double = js.native
  /* 0 */ val Dirty: Dirty with scala.Double = js.native
  /* 5 */ val NewRow: NewRow with scala.Double = js.native
  /* 4 */ val RowError: RowError with scala.Double = js.native
  /* 1 */ val Transfer: Transfer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities with scala.Double] = js.native
}

