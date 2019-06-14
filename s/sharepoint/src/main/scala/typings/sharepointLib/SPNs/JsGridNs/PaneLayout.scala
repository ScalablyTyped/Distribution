package typings
package sharepointLib.SPNs.JsGridNs

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
  sealed trait GridAndGantt
    extends sharepointLib.SPNs.JsGridNs.PaneLayout
  
  @js.native
  sealed trait GridAndPivotedGrid
    extends sharepointLib.SPNs.JsGridNs.PaneLayout
  
   // 0,
  @js.native
  sealed trait GridOnly
    extends sharepointLib.SPNs.JsGridNs.PaneLayout
  
  /* 1 */ val GridAndGantt: GridAndGantt with scala.Double = js.native
  /* 2 */ val GridAndPivotedGrid: GridAndPivotedGrid with scala.Double = js.native
  /* 0 */ val GridOnly: GridOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.PaneLayout with scala.Double] = js.native
}

