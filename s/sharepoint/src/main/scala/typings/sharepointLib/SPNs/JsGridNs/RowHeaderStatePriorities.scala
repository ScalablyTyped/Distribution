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
  
  val CellError: CellError with java.lang.String = js.native
  val Conflict: Conflict with java.lang.String = js.native
  val Dirty: Dirty with java.lang.String = js.native
  val NewRow: NewRow with java.lang.String = js.native
  val RowError: RowError with java.lang.String = js.native
  val Transfer: Transfer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.RowHeaderStatePriorities with java.lang.String] = js.native
}

