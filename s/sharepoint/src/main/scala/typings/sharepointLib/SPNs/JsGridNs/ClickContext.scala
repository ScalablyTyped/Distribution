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
  
  val Cell: Cell with java.lang.String = js.native
  val ColumnHeader: ColumnHeader with java.lang.String = js.native
  val Gantt: Gantt with java.lang.String = js.native
  val Other: Other with java.lang.String = js.native
  val RowHeader: RowHeader with java.lang.String = js.native
  val SelectAllSquare: SelectAllSquare with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.ClickContext with java.lang.String] = js.native
}

