package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GanttDrawBarFlags extends js.Object

@JSGlobal("SP.JsGrid.GanttDrawBarFlags")
@js.native
object GanttDrawBarFlags extends js.Object {
   // 0x01,
  @js.native
  sealed trait LeftLink
    extends sharepointLib.SPNs.JsGridNs.GanttDrawBarFlags
  
  @js.native
  sealed trait RightLink
    extends sharepointLib.SPNs.JsGridNs.GanttDrawBarFlags
  
  /* 0 */ val LeftLink: LeftLink with scala.Double = js.native
  /* 1 */ val RightLink: RightLink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.GanttDrawBarFlags with scala.Double] = js.native
}

