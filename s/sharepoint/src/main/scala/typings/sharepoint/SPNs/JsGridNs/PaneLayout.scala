package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaneLayout extends js.Object

@JSGlobal("SP.JsGrid.PaneLayout")
@js.native
object PaneLayout extends js.Object {
   // 1,
  @js.native
  sealed trait GridAndGantt extends PaneLayout
  
  @js.native
  sealed trait GridAndPivotedGrid extends PaneLayout
  
   // 0,
  @js.native
  sealed trait GridOnly extends PaneLayout
  
  /* 1 */ val GridAndGantt: typings.sharepoint.SPNs.JsGridNs.PaneLayout.GridAndGantt with Double = js.native
  /* 2 */ val GridAndPivotedGrid: typings.sharepoint.SPNs.JsGridNs.PaneLayout.GridAndPivotedGrid with Double = js.native
  /* 0 */ val GridOnly: typings.sharepoint.SPNs.JsGridNs.PaneLayout.GridOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaneLayout with Double] = js.native
}

