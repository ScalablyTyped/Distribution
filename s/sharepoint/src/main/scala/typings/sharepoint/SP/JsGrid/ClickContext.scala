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
  
}

