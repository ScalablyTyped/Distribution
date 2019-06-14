package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClickContext extends js.Object

@JSGlobal("SP.JsGrid.ClickContext")
@js.native
object ClickContext extends js.Object {
  @js.native
  sealed trait Cell
    extends sharepointLib.SPNs.JsGridNs.ClickContext
  
  @js.native
  sealed trait ColumnHeader
    extends sharepointLib.SPNs.JsGridNs.ClickContext
  
  @js.native
  sealed trait Gantt
    extends sharepointLib.SPNs.JsGridNs.ClickContext
  
  @js.native
  sealed trait Other
    extends sharepointLib.SPNs.JsGridNs.ClickContext
  
  @js.native
  sealed trait RowHeader
    extends sharepointLib.SPNs.JsGridNs.ClickContext
  
  @js.native
  sealed trait SelectAllSquare
    extends sharepointLib.SPNs.JsGridNs.ClickContext
  
  /* 3 */ val Cell: Cell with scala.Double = js.native
  /* 2 */ val ColumnHeader: ColumnHeader with scala.Double = js.native
  /* 4 */ val Gantt: Gantt with scala.Double = js.native
  /* 5 */ val Other: Other with scala.Double = js.native
  /* 1 */ val RowHeader: RowHeader with scala.Double = js.native
  /* 0 */ val SelectAllSquare: SelectAllSquare with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.ClickContext with scala.Double] = js.native
}

