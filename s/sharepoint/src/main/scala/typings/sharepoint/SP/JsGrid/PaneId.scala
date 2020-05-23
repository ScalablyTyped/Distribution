package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaneId extends js.Object

@JSGlobal("SP.JsGrid.PaneId")
@js.native
object PaneId extends js.Object {
  @js.native
  sealed trait Gantt extends PaneId
  
   // 0,
  @js.native
  sealed trait MainGrid extends PaneId
  
   // 1,
  @js.native
  sealed trait PivotedGrid extends PaneId
  
}

