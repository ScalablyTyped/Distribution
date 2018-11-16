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
  
  val Gantt: Gantt with java.lang.String = js.native
  val MainGrid: MainGrid with java.lang.String = js.native
  val PivotedGrid: PivotedGrid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.PaneId with java.lang.String] = js.native
}

