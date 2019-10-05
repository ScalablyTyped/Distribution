package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClickContext extends js.Object

@JSGlobal("SP.JsGrid.ClickContext")
@js.native
object ClickContext extends js.Object {
  @js.native
  sealed trait Cell extends ClickContext
  
  @js.native
  sealed trait ColumnHeader extends ClickContext
  
  @js.native
  sealed trait Gantt extends ClickContext
  
  @js.native
  sealed trait Other extends ClickContext
  
  @js.native
  sealed trait RowHeader extends ClickContext
  
  @js.native
  sealed trait SelectAllSquare extends ClickContext
  
  /* 3 */ val Cell: typings.sharepoint.SP.JsGrid.ClickContext.Cell with Double = js.native
  /* 2 */ val ColumnHeader: typings.sharepoint.SP.JsGrid.ClickContext.ColumnHeader with Double = js.native
  /* 4 */ val Gantt: typings.sharepoint.SP.JsGrid.ClickContext.Gantt with Double = js.native
  /* 5 */ val Other: typings.sharepoint.SP.JsGrid.ClickContext.Other with Double = js.native
  /* 1 */ val RowHeader: typings.sharepoint.SP.JsGrid.ClickContext.RowHeader with Double = js.native
  /* 0 */ val SelectAllSquare: typings.sharepoint.SP.JsGrid.ClickContext.SelectAllSquare with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClickContext with Double] = js.native
}

