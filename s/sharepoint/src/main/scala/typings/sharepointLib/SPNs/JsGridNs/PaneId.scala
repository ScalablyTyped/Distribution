package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaneId extends js.Object

@JSGlobal("SP.JsGrid.PaneId")
@js.native
object PaneId extends js.Object {
  @js.native
  sealed trait Gantt
    extends sharepointLib.SPNs.JsGridNs.PaneId
  
   // 0,
  @js.native
  sealed trait MainGrid
    extends sharepointLib.SPNs.JsGridNs.PaneId
  
   // 1,
  @js.native
  sealed trait PivotedGrid
    extends sharepointLib.SPNs.JsGridNs.PaneId
  
  /* 2 */ val Gantt: Gantt with scala.Double = js.native
  /* 0 */ val MainGrid: MainGrid with scala.Double = js.native
  /* 1 */ val PivotedGrid: PivotedGrid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.PaneId with scala.Double] = js.native
}

