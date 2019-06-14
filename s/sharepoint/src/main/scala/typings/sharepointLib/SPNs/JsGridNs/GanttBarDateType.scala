package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttBarDateType extends js.Object

@JSGlobal("SP.JsGrid.GanttBarDateType")
@js.native
object GanttBarDateType extends js.Object {
  @js.native
  sealed trait End
    extends sharepointLib.SPNs.JsGridNs.GanttBarDateType
  
   // 0,
  @js.native
  sealed trait Start
    extends sharepointLib.SPNs.JsGridNs.GanttBarDateType
  
  /* 1 */ val End: End with scala.Double = js.native
  /* 0 */ val Start: Start with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.GanttBarDateType with scala.Double] = js.native
}

