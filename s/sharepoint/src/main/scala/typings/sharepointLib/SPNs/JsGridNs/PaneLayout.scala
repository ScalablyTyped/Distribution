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
  
  val GridAndGantt: GridAndGantt with java.lang.String = js.native
  val GridAndPivotedGrid: GridAndPivotedGrid with java.lang.String = js.native
  val GridOnly: GridOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.PaneLayout with java.lang.String] = js.native
}

