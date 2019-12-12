package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.JsGrid.ClickContext.Cell
import typings.sharepoint.SP.JsGrid.ClickContext.ColumnHeader
import typings.sharepoint.SP.JsGrid.ClickContext.Gantt
import typings.sharepoint.SP.JsGrid.ClickContext.Other
import typings.sharepoint.SP.JsGrid.ClickContext.RowHeader
import typings.sharepoint.SP.JsGrid.ClickContext.SelectAllSquare
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClickContext with Double] = js.native
  /* 3 */ @js.native
  object Cell extends TopLevel[Cell with Double]
  
  /* 2 */ @js.native
  object ColumnHeader extends TopLevel[ColumnHeader with Double]
  
  /* 4 */ @js.native
  object Gantt extends TopLevel[Gantt with Double]
  
  /* 5 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  /* 1 */ @js.native
  object RowHeader extends TopLevel[RowHeader with Double]
  
  /* 0 */ @js.native
  object SelectAllSquare extends TopLevel[SelectAllSquare with Double]
  
}

