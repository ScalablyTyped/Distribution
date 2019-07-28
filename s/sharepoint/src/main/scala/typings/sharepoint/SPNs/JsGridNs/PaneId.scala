package typings.sharepoint.SPNs.JsGridNs

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
  
  /* 2 */ val Gantt: typings.sharepoint.SPNs.JsGridNs.PaneId.Gantt with Double = js.native
  /* 0 */ val MainGrid: typings.sharepoint.SPNs.JsGridNs.PaneId.MainGrid with Double = js.native
  /* 1 */ val PivotedGrid: typings.sharepoint.SPNs.JsGridNs.PaneId.PivotedGrid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaneId with Double] = js.native
}

